package com.lognsys.babycare.vo;

public class CompoundsVO
{
	private int id;

	private String organic_compound;

	public CompoundsVO(String organic_compound)
	{
		super();
		this.organic_compound = organic_compound;
	}
	public CompoundsVO()
	{
		// TODO Auto-generated constructor stub
	}

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

	public void setOrganicCompound(String organic_compound)
	{
		this.organic_compound = organic_compound;
	}

}
