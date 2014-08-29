package com.lognsys.babycare.core.common;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.lognsys.babycare.core.PregnancyException;

public class PregnancyUtilTest

{
	
	private static final String DATE_FORMAT_INPUT = "ddMMyyyy";
	
	  @Rule
	  public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testCalculateDueDate() throws PregnancyException
	{
		String pregnancyDueDate = PregnancyUtil.calculateDueDate("01012014");
		Assert.assertEquals("8 Oct Wed 2014", pregnancyDueDate);
	
		String dueDatePassed = PregnancyUtil.calculateDueDate("01012013");
		Assert.assertEquals("8 Oct Tue 2013", dueDatePassed);
	
		exception.expect(IllegalFieldValueException.class);
		PregnancyUtil.calculateDueDate("12132014");
		
		exception.expect(IllegalFieldValueException.class);
		PregnancyUtil.calculateDueDate("");
		
		
	}
	
	@Test
	public void testNormalizePregnancyWeek() throws PregnancyException
	{
		List<String> weeks = new ArrayList<String>();
		weeks.add("1-4");
		weeks.add("5-8");
		weeks.add("9-13");
		weeks.add("14-17");
		weeks.add("18-21");
		weeks.add("22-26");
		weeks.add("27-30");
		weeks.add("31-35");
		weeks.add("36-40");
		
		Assert.assertEquals(1,PregnancyUtil.normalizePregnancyStage(weeks, new DateTime().toString(DATE_FORMAT_INPUT)));
		Assert.assertEquals(6,PregnancyUtil.normalizePregnancyStage(weeks, new DateTime().minusWeeks(22).toString(DATE_FORMAT_INPUT)));
		Assert.assertEquals(3,PregnancyUtil.normalizePregnancyStage(weeks, new DateTime().minusWeeks(10).toString(DATE_FORMAT_INPUT)));
	

	}

}
