package com.lognsys.babycare.vo;

import java.util.Date;

public class StagesVO
{
	private int id;

	private String month;

	private String week;

	private Date last_edit;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getMonth()
	{
		return month;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}

	public String getWeek()
	{
		return week;
	}

	public void setWeek(String week)
	{
		this.week = week;
	}

	public Date getLast_edit()
	{
		return last_edit;
	}

	public void setLast_edit(Date last_edit)
	{
		this.last_edit = last_edit;
	}

}
