package com.sapient.training.departmentCount.departmentCountController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sapient.training.departmentCount.model.departmentCount.*;
import com.sapient.training.departmentCount.service.CountService;

@RestController
public class DepartmentCountController {

	@Autowired
	CountService countService;

	@GetMapping("/count/{id}")
	public DepartmentCount getCountById(@PathVariable int id) {
		return countService.getCountById(id);
	}

	@GetMapping("/count")
	public List<DepartmentCount> getCount() {
		return countService.getCount();
	}
}
