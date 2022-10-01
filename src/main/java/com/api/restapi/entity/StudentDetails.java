package com.api.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String FirstName;
	private String LastName;
	private String CityFrom;
	private String Branch;
	
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDetails(int id, String firstName, String lastName, String cityFrom, String branch) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		CityFrom = cityFrom;
		Branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getCityFrom() {
		return CityFrom;
	}

	public void setCityFrom(String cityFrom) {
		CityFrom = cityFrom;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", CityFrom="
				+ CityFrom + ", Branch=" + Branch + "]";
	}
}
