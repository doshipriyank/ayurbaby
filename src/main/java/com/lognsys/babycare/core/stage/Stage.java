package com.lognsys.babycare.core.stage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lognsys.babycare.core.food.Ayurvedic;
import com.lognsys.babycare.core.food.Nutritional;
import com.lognsys.babycare.core.user.User;

@Entity
@Table(name = "ayurbaby_stages")
public class Stage implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1072841349324968487L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "month")
	private String month;

	@Column(name = "week")
	private String week;

	@Column(name = "last_edit")
	private Date last_edit;

//	@OneToMany(fetch=FetchType.EAGER)
//	@JoinColumn(name = "stage_id")
//	private Set<User> users = new HashSet<User>();

	@JoinTable(name = "ayurbaby_stage_ayurved", joinColumns = { @JoinColumn(name = "stage_id") }, inverseJoinColumns = { @JoinColumn(name = "ayurved_id") })
	@ManyToMany
	private Collection<Ayurvedic> ayurvedic;

	@JoinTable(name = "ayurbaby_stage_nutritionalfood", joinColumns = { @JoinColumn(name = "stage_id") }, inverseJoinColumns = { @JoinColumn(name = "nutritionalfood_id") })
	@ManyToMany
	private Collection<Nutritional> nutritional;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getMonth()
	{
		return month;
	}

	public void setMonth(String month)
	{
		this.month = month;
	}

	public String getWeek()
	{
		return week;
	}

	public void setWeek(String week)
	{
		this.week = week;
	}

	public Date getLast_edit()
	{
		return last_edit;
	}

	public void setLast_edit(Date last_edit)
	{
		this.last_edit = last_edit;
	}
//
//	public Set<User> getUsers()
//	{
//		return Collections.unmodifiableSet(users);
//	}
//
//	public void setUsers(Set<User> users)
//	{
//		this.users = users;
//	}

	@Override
	public String toString()
	{
		return "Stage [stage_id=" + id + ", month=" + month + ", week=" + week + ", last_edit=" + last_edit + "]";
	}

}
