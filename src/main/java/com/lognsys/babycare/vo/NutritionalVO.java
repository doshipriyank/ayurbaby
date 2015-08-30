/**
 * @author pdoshi
 * 
 * Change Log: 
 * 6/24/14 - Removed stage_id field to match with database fields
 * 6/24/12 - Added group_id
 */

package com.lognsys.babycare.vo;

import java.util.Date;

public class NutritionalVO {
	public String month = "";

	private String food = "";

	private String benefit = "";

	private String warning = "";

	private Date last_edit;

	private int id;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Date getLast_edit() {
		return last_edit;
	}

	public void setLast_edit(Date last_edit) {
		this.last_edit = last_edit;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

}
