package com.sapient.training.departmentCatalogue.model.catalogue;

public class Department {

	int id;
	String name; 
	int count;
	String description;
	
	
	
	public Department() {
		
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, int count, String description) {
	
		this.id = id;
		this.name = name;
		this.count = count;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
