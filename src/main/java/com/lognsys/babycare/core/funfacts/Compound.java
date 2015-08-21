package com.lognsys.babycare.core.funfacts;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "ayurbaby_compound")
public class Compound implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5358007031743808487L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private String organic_compound;

	@OneToMany( cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="compound_id")
	@JsonManagedReference
//	@OneToMany(mappedBy="compound")
	private List<Facts> facts;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getOrganic_compound()
	{
		return organic_compound;
	}

	public void setOrganic_compound(String organic_compound)
	{
		this.organic_compound = organic_compound;
	}

	public List<Facts> getFacts()
	{
		return facts;
	}

	public void setFacts(List<Facts> facts)
	{
		this.facts = facts;
	}

}
