package com.lognsys.babycare.core.food;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.neo4j.annotation.Fetch;

import com.lognsys.babycare.core.stage.Stage;

@Entity
@Table(name = "ayurbaby_ayurved")
public class Ayurvedic implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;

	private String ayurvedic_med;

	private String prepmethod;

	private String nutritional_value;

	private String foetus_dev;

	private Date last_edit;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "ayurbaby_stage_ayurved", joinColumns = { @JoinColumn(name = "ayurved_id") }, inverseJoinColumns = { @JoinColumn(name = "stage_id") })
	private Collection<Stage> stages;

	public Ayurvedic()
	{
		// no-arg constructor
	}

	public Ayurvedic(int id, String ayurvedic_med, String prepmethod, String nutritional_value, String foetus_dev,
			Date last_edit)
	{

		this.id = id;
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

	public Collection<Stage> getStages()
	{
		return stages;
	}

	public void setStages(Collection<Stage> stages)
	{
		this.stages = stages;
	}

	@Override
	public String toString()
	{
		return "Ayurvedic [id=" + id + ", ayurvedic_med=" + ayurvedic_med + ", prepmethod=" + prepmethod
				+ ", nutritional_value=" + nutritional_value + ", foetus_dev=" + foetus_dev + ", last_edit="
				+ last_edit + ", stages=" + stages + "]";
	}

}
