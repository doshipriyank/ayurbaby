package com.lognsys.babycare.core.common;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.lognsys.babycare.core.PregnancyException;

public class PregnancyUtil
{

	private static final String DATE_FORMAT_OUTPUT = "d MMM E yyyy";

	private static final String DATE_FORMAT_INPUT = "ddMMyyyy";

	// estimated due dates (EDD)
	private static final int EDD_DAYS = 280;

	// max pregnanyc weeks
	private static final int MAX_FINAL_WEEK = 40;

	private static final DateTimeFormatter inputDtf = DateTimeFormat.forPattern(DATE_FORMAT_INPUT);

	private static final DateTimeFormatter oututDtf = DateTimeFormat.forPattern(DATE_FORMAT_OUTPUT);
	

	/**
	 * Naegael's Rule - calculate Due date 
	 * 1. first day of your last period, count backward 3 months 
	 * 2. add 7 days, 
	 * and add an entire year
	 * 
	 * @param lastMenCycleDate
	 * @return returns date time (joda time api)
	 * @throws PregnancyException
	 */
	public static String calculateDueDate(String lastMenCycleDate) throws PregnancyException
	{
		DateTime originalDate = null;

		originalDate = inputDtf.parseDateTime(lastMenCycleDate);

		if (originalDate.toLocalDate().isAfter(getCurrentDate()))
			throw new PregnancyException("Invalid Lmp Date - "+originalDate +"> Today's date - "+getCurrentDate());

		DateTime dueDate = originalDate.plusDays(EDD_DAYS);

		return dueDate.toString(oututDtf);

	}

	/**
	 * Add LMP + 7 to start the pregnancy countdown
	 * 
	 * @param weeks list<String> of weeks
	 * @param lmp (last menstrual cycle) Date in dd/MM/yyyy format
	 * @return returns week
	 * @throws PregnancyException
	 */
	public static int normalizePregnancyStage(List<String> weeks, String lmp) throws PregnancyException
	{
		int stage = 0;

		// param lmp converted to DateTime
		DateTime lmpDate = inputDtf.parseDateTime(lmp);

		// check lmpDate > currentDate
		if (lmpDate.toLocalDate().isAfter(getCurrentDate()))
			throw new PregnancyException("Invalid Lmp Date - "+lmpDate +"> Today's date - "+getCurrentDate());

		int week = Weeks.weeksBetween(lmpDate.toLocalDate(), getCurrentDate()).getWeeks();

		if (week == 0)
			return 1;

		if (week > MAX_FINAL_WEEK)
			throw new PregnancyException("Due Date crossed. weeks passed - " + week);

		stage = getStageByWeek(weeks, week);

		if (stage == 0)
			return 1;

		return stage;

	}

	/**
	 * list<String> weeks range eg. (1-4) from database is parsed and converted into Integer find week in the week range
	 * and return pregnancy stage or month
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

			if (week >= weekRange.get(0) && week <= weekRange.get(1))
			{
				return stage;
			}

		}
		return stage;

	}
	
	private static LocalDate getCurrentDate()
	{
		return DateTime.now(DateTimeZone.UTC).toLocalDate();
	}

}
