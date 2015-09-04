package com.lognsys.babycare.core.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ayurbaby_users")
public class User implements Serializable {

	private static final long serialVersionUID = 5161794650595376352L;

	public User() {
		// no-arg constructor to throw error
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "auth_id")
	private String auth_id = "";

	@Column(name = "firstname")
	private String firstname = "";

	@Column(name = "lastname")
	private String lastname = "";

	@Column(name = "lastmenperiod")
	private String lastmenperiod = "";

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "location")
	private String location = "";

	@Column(name = "phone")
	private String phone = "";

	@Column(name = "birthdate")
	private String birthdate = "";

	@Column(name = "duedate")
	private String duedate = "";

	@Column(name = "stage_id")
	private int stage = 1;

	@Column(nullable = false, columnDefinition = "TINYINT", length = 1, name = "notification")
	private boolean notification;

	@Column(name = "provenance")
	private String provenance = "";

	@Column(name = "registration")
	private String registration = "";

	@Column(name = "last_edit")
	private Date last_edit;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastmenperiod() {
		return lastmenperiod;
	}

	public void setLastmenperiod(String lastmenperiod) {
		this.lastmenperiod = lastmenperiod;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public Date getLast_edit() {
		return last_edit;
	}

	public void setLast_edit(Date last_edit) {
		this.last_edit = last_edit;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(String auth_id) {
		this.auth_id = auth_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isNotification() {
		return notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}

}
