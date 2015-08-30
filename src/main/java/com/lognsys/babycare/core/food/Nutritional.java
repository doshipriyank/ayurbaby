package com.lognsys.babycare.core.food;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonBackReference;


import com.lognsys.babycare.core.stage.Stage;

@Entity
@Table(name = "ayurbaby_nutritionalfood")
public class Nutritional implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String food;

	private String benefit;

	private String warning;

	private Date last_edit;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ayurbaby_stage_nutritionalfood", joinColumns = {
			@JoinColumn(name = "nutritionalfood_id") }, inverseJoinColumns = { @JoinColumn(name = "stage_id") })
	@JsonBackReference
	private Collection<Stage> stages;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
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

	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

}
