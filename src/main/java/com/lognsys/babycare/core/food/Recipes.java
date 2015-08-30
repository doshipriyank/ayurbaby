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
@Table(name = "ayurbaby_recipe")
public class Recipes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String recipe;

	private String benefit;

	private String types;

	private Date last_edit;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ayurbaby_stage_recipe", joinColumns = { @JoinColumn(name = "recipe_id") }, inverseJoinColumns = {
			@JoinColumn(name = "stage_id") })
	@JsonBackReference
	private Collection<Stage> stages;

	public Recipes() {
		// TODO Auto-generated constructor stub
	}

	public Recipes(int id, String name, String recipe, String benefit, String types, Date last_edit) {

		this.id = id;
		this.name = name;
		this.benefit = benefit;
		this.recipe = recipe;
		this.types = types;
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

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

}
