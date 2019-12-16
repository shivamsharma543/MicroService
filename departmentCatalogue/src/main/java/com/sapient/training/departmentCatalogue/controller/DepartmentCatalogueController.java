package com.sapient.training.departmentCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.training.departmentCatalogue.model.catalogue.Department;
import com.sapient.training.departmentCatalogue.service.CataloogueService;

@RestController
public class DepartmentCatalogueController {
	
	@Autowired
	CataloogueService cataloogueService;
	
	@GetMapping("/count/{id}")
	public Department getCountById(@PathVariable int id) {
		return cataloogueService.getDepartment(id);
	}
	
	@GetMapping("/count")
	public List<Department> getCount() {
		return cataloogueService.getListDepartment();
		
	}
	
	@GetMapping("/description/{id}")
	public String getDescriptionById(@PathVariable int id) {
		
		return null;
	}
	
	@GetMapping("/description")
	public String getDesription(@PathVariable int id) {
		return null;
	}

}
