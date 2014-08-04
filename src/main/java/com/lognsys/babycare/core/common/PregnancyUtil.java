package com.lognsys.babycare.core.common;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.lognsys.babycare.core.PregnancyException;

public class PregnancyUtil
{

	private static final String DATE_FORMAT_OUTPUT = "d MMM E yyyy";

	private static final String DATE_FORMAT_INPUT = "ddMMyyyy";

	private static final int LMP_ADD_DAYS = 7;

	private static final int MAX_PREG_MONTHS = 9;

	private static final int MAX_FINAL_WEEK = 40;

	private static DateTimeFormatter inputDtf = DateTimeFormat.forPattern(DATE_FORMAT_INPUT);

	private static DateTimeFormatter oututDtf = DateTimeFormat.forPattern(DATE_FORMAT_OUTPUT);

	/**
	 * Due date is calculated in two steps: 1) Add LMP + 7 days = pregnancy start date. 2) Add pregnancy start date + 9
	 * months to get approximate Due date
	 * 
	 * @param lastMenCycleDate
	 * @return returns date time (joda time api)
	 * @throws PregnancyException
	 */
	public static String calculateDueDate(String lastMenCycleDate) throws PregnancyException
	{
		DateTime originalDate = null;

		try
		{
			originalDate = inputDtf.parseDateTime(lastMenCycleDate);
		}
		catch (IllegalFieldValueException dateEx)
		{
			dateEx.printStackTrace();
			return null;
		}
		catch (IllegalArgumentException ex)
		{
			ex.printStackTrace();
			return null;
		}

		DateTime dateAfterLmpDays = originalDate.plusDays(LMP_ADD_DAYS);

		DateTime dueDate = dateAfterLmpDays.plusMonths(MAX_PREG_MONTHS);

		if (dueDate.isBefore(DateTime.now()))
			throw new PregnancyException("Due Date crossed  - " + dueDate.toString(oututDtf));

		return dueDate.toString(oututDtf);

	}

	/**
	 * @param weeks list<String> of weeks
	 * @param lmp (last menstrual cycle) Date in dd/MM/yyyy format
	 * @return returns week
	 * @throws PregnancyException
	 */
	public static int normalizePregnancyStage(List<String> weeks, String lmp) throws PregnancyException
	{
		int stage = 0;
		DateTime lmpDate = inputDtf.parseDateTime(lmp).plusDays(LMP_ADD_DAYS);

		int week = Weeks.weeksBetween(lmpDate, DateTime.now(DateTimeZone.UTC)).getWeeks();
		
		if(week == 0)
			return 1;

		if (week > MAX_FINAL_WEEK)
			throw new PregnancyException("Due Date crossed. weeks passed - " + week);
		
		 stage =  getStageByWeek(weeks, week);
		 
		 if(stage == 0)
			 return 1;
		 
		 return stage;

		
	}

	/**
	 * list<String> weeks range eg. (1-4) from database is parsed and converted into Integer
	 * find week in the week range and return pregnancy stage or month
	 * 
	 * @param weeks
	 * @return returns best stage(pregnancy month) based on week
	 */
	private static int getStageByWeek(List<String> weeks, int week)
	{
		int stage = 0;

		for (String weekStr : weeks)
		{
			stage++;

			StringTokenizer weekTokenizer = new StringTokenizer(weekStr, "-");

			List<Integer> weekRange = new ArrayList<Integer>();

			while (weekTokenizer.hasMoreElements())
			{
				weekRange.add(Integer.parseInt(weekTokenizer.nextElement().toString()));
			}

		//	System.out.println(weekRange);
			if (week >= weekRange.get(0) && week <= weekRange.get(1))
			{
				return stage;
			}
				
		}
		return stage;

	}
}
