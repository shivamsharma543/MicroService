package com.sapient.training.departmentDescription.descriptionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.training.departmentDescription.model.departmentDescription.DepartmentDescription;
import com.sapient.training.departmentDescription.service.DescriptionService;

@RestController
public class DescriptionController {

	@Autowired
	DescriptionService  descriptionService;
	
	
	@GetMapping("/description/{id}")
	public DepartmentDescription getDescriptionById(@PathVariable int id) {
		return descriptionService.getDescriptionById(id);
		
	}
	
	@GetMapping("/description")
	public List<DepartmentDescription> getDesription(@PathVariable int id) {
		return descriptionService.getDescription();
	}
}
