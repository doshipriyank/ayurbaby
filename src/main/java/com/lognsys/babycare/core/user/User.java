package com.lognsys.babycare.core.user;

import java.io.Serializable;

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

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "auth_id")
	private String auth_id;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "lastmenperiod")
	private String lastMenPeriod;

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "location")
	private String location;

	@Column(name = "phone")
	private String phone;

	@Column(name = "birthdate")
	private String birthDate;

	@Column(name = "duedate")
	private String dueDate;

	@Column(name = "stage_id")
	private String stage;

	@Column(nullable = false, columnDefinition = "TINYINT", length = 1, name = "notification")
	private boolean notification;
	
	@Column(name = "provenance")
	private String provenance;

	public String getProvenance() {
		return provenance;
	}

	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastMenPeriod() {
		return lastMenPeriod;
	}

	public void setLastMenPeriod(String lastMenPeriod) {
		this.lastMenPeriod = lastMenPeriod;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isNotification() {
		return notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", auth_id=" + auth_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", lastMenPeriod=" + lastMenPeriod + ", email=" + email + ", location=" + location + ", phone="
				+ phone + ", birthDate=" + birthDate + ", dueDate=" + dueDate + ", stage=" + stage + ", notification="
				+ notification + "]";
	}

}
