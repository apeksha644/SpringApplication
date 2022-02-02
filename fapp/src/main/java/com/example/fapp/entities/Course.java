package com.example.fapp.entities;

import javax.persistence.Entity;

@Entity
public class Course {
	
	private long id;
	private String name;
	private String Department;
	public Course(long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	
	
	
	
	

}
