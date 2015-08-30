package com.lognsys.babycare.vo;

import java.util.Date;

public class RecipesVO {

	public String month = "";

	private String name = "";

	private String recipe = "";

	private String benefit = "";

	private String type = "";

	private Date last_edit;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getLast_edit() {
		return last_edit;
	}

	public void setLast_edit(Date last_edit) {
		this.last_edit = last_edit;
	}

}
