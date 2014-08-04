/**
 * @author pdoshi
 * 
 * Change Log: 
 * 6/24/14 - Removed stage_id field to match with database fields
 * 6/24/12 - Added group_id
 */

package com.lognsys.babycare.vo;

import java.util.Date;

public class NutritionalVO
{
	public String month = "";

	private String food = "";

	private String fruits = "";

	private String prepmethod = "";

	private String nutritional_value = "";

	private String foetus_dev = "";

	private String warnings = "";

	public String getMonth()
	{
		return month;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}
	
	public String getWarnings()
	{
		return warnings;
	}

	public void setWarnings(String warnings)
	{
		this.warnings = warnings;
	}

	private Date last_edit;

	private int id;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}


	public String getFood()
	{
		return food;
	}

	public void setFood(String food)
	{
		this.food = food;
	}

	public String getFruits()
	{
		return fruits;
	}

	public void setFruits(String fruits)
	{
		this.fruits = fruits;
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

	public void setNutritionalValue(String nutritional_value)
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

	@Override
	public String toString()
	{
		return "NutritionalVO [Month ="+month+"food=" + food + ", fruits=" + fruits + ", prepmethod="
				+ prepmethod + ", nutritionalValue=" + nutritional_value + ", foetus_dev=" + foetus_dev + ", warnings="
				+ warnings + ", id=" + id + "]";
	}

}
