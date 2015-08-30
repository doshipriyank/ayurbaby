package com.lognsys.babycare.vo;

import java.sql.Date;

public class AyurvedicVO {

	private int id;

	private String month = "";

	private String medicine = "";

	private String benefit = "";

	private String recipes = "";

	private String warning = "";

	private Date last_edit;

	public AyurvedicVO() {
		// TODO Auto-generated constructor stub
	}

	public AyurvedicVO(int id, String month, String medicine, String benefit, String recipes, String warning,
			Date last_edit) {
		super();
		this.id = id;
		this.month = month;
		this.medicine = medicine;
		this.benefit = benefit;
		this.recipes = recipes;
		this.warning = warning;
		this.last_edit = last_edit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getRecipes() {
		return recipes;
	}

	public void setRecipes(String recipes) {
		this.recipes = recipes;
	}

	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

	public Date getLast_edit() {
		return last_edit;
	}

	public void setLast_edit(Date last_edit) {
		this.last_edit = last_edit;
	}

}
