package com.sapient.training.departmentDescription.model.departmentDescription;

public class DepartmentDescription {

	int id;
	String description;
	
	

	public DepartmentDescription() {
		
	}

	public DepartmentDescription(int id, String description) {

		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
