package com.lognsys.babycare.vo;

import java.sql.Date;

public class AyurvedicVO
{

	private int id;
	
	private String month = "";

	private String ayurvedic_med = "";

	private String prepmethod = "";

	private String nutritional_value = "";

	private String foetus_dev = "";

	private Date last_edit;

	public AyurvedicVO()
	{
		// TODO Auto-generated constructor stub
	}

	public AyurvedicVO(int id, String month, String ayurvedic_med, String prepmethod, String nutritional_value,
			String foetus_dev, Date last_edit)
	{
		super();
		this.id = id;
		this.month = month;
		this.ayurvedic_med = ayurvedic_med;
		this.prepmethod = prepmethod;
		this.nutritional_value = nutritional_value;
		this.foetus_dev = foetus_dev;
		this.last_edit = last_edit;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getAyurvedic_med()
	{
		return ayurvedic_med;
	}

	public void setAyurvedic_med(String ayurvedic_med)
	{
		this.ayurvedic_med = ayurvedic_med;
	}

	public String getPrepmethod()
	{
		return prepmethod;
	}

	public void setPrepmethod(String prepmethod)
	{
		this.prepmethod = prepmethod;
	}

	public String getNutritional_value()
	{
		return nutritional_value;
	}

	public void setNutritional_value(String nutritional_value)
	{
		this.nutritional_value = nutritional_value;
	}

	public String getFoetus_dev()
	{
		return foetus_dev;
	}

	public void setFoetus_dev(String foetus_dev)
	{
		this.foetus_dev = foetus_dev;
	}

	public Date getLast_edit()
	{
		return last_edit;
	}

	public void setLast_edit(Date last_edit)
	{
		this.last_edit = last_edit;
	}
	public String getMonth()
	{
		return month;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}
}
