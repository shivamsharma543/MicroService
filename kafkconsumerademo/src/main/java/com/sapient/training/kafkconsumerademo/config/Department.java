package com.sapient.training.kafkconsumerademo.config;

public class Department {

	private int id;
	private String message;
	private String name;
	
	
	
	public Department() {
	
		// TODO Auto-generated constructor stub
	}


	public Department(int id,String message, String name) {
		super();
		this.id = id;
		this.message=message;
		this.name = name;
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


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
