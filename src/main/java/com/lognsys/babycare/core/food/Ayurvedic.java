package com.lognsys.babycare.core.food;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
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
@Table(name = "ayurbaby_ayurved")
public class Ayurvedic implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String medicine;

	private String benefit;

	private String recipes;

	private String warning;

	private Date last_edit;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ayurbaby_stage_ayurved", joinColumns = {
			@JoinColumn(name = "ayurved_id") }, inverseJoinColumns = { @JoinColumn(name = "stage_id") })
	@JsonBackReference
	private Collection<Stage> stages;

	public Ayurvedic() {
		// no-arg constructor
	}

	public Ayurvedic(int id, String medicine, String benefit, String recipes, String warning, Date last_edit) {

		this.id = id;
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

	public Date getLast_edit() {
		return last_edit;
	}

	public void setLast_edit(Date last_edit) {
		this.last_edit = last_edit;
	}

	public Collection<Stage> getStages() {
		return stages;
	}

	public void setStages(Collection<Stage> stages) {
		this.stages = stages;
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

}
