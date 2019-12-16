package com.sapient.training.departmentCatalogue.model.catalogue;

public class DepartmentDescription {

	String description;
	int id;
	
	
	
	public DepartmentDescription() {
	
		// TODO Auto-generated constructor stub
	}

	public DepartmentDescription(String description, int id) {
	
		this.description = description;
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
