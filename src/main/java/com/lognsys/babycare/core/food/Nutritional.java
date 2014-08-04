package com.lognsys.babycare.core.food;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.lognsys.babycare.core.stage.Stage;

@Entity
@Table(name = "ayurbaby_nutritionalfood")
public class Nutritional implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private String food;

	private String fruits;

	private String prepmethod;

	private String nutritional_value;

	private String foetus_dev;

	private String warnings;

	private Date last_edit;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "ayurbaby_stage_nutritionalfood", joinColumns = { @JoinColumn(name = "nutritionalfood_id") }, inverseJoinColumns = { @JoinColumn(name = "stage_id") })
	private Collection<Stage> stages;

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

	public String getWarnings()
	{
		return warnings;
	}

	public void setWarnings(String warnings)
	{
		this.warnings = warnings;
	}

	@Override
	public String toString()
	{
		return "Nutritional [" + "food=" + food + ", fruits=" + fruits + ", prepmethod=" + prepmethod
				+ ", nutritionalValue=" + nutritional_value + ", foetus_dev=" + foetus_dev + ", warnings=" + warnings
				+ ", id=" + id + "]";
	}

}
