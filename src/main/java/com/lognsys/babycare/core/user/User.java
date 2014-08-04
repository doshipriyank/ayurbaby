package com.lognsys.babycare.core.user;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lognsys.babycare.core.stage.Stage;

@Entity
@Table(name = "ayurbaby_users")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5161794650595376352L;

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "pword")
	private String password;

	@Column(name = "fullname")
	private String fullname;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	@OneToOne
	@JoinColumn(name = "stage_id")
	private Stage stage;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getFullname()
	{
		return fullname;
	}

	public void setFullname(String fullname)
	{
		this.fullname = fullname;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public Stage getStage()
	{
		return stage;
	}

	@Override
	public String toString()
	{
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ ", phone=" + phone + ", address=" + address + ", stage=" + stage + "]";
	}

}
