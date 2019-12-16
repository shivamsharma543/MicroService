package com.sapient.training.departmentCatalogue.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sapient.training.departmentCatalogue.model.catalogue.*;

@Service
public class CataloogueService {

	@Autowired
	RestTemplate restTemplate;
	
	List<DepartmentCatalogue> list = new ArrayList(Arrays.asList(new DepartmentCatalogue(1, "Physics"),
			new DepartmentCatalogue(2, "Chmistry"), new DepartmentCatalogue(3, "JAVA")));

	public DepartmentCatalogue getCatalogue(int id) {
		return list.stream().filter(c -> c.getId() == id).findFirst().get();

	}

	public List<DepartmentCatalogue> getCatalogueList() {
		return list;
	}

	public Department getDepartment(int id) {

		// list.stream().forEach(a.);
		DepartmentCount departmentCount = restTemplate.getForObject("http://department-count/count/" + id,
				DepartmentCount.class);
		DepartmentDescription departmentDescription = restTemplate
				.getForObject("http://department-description/description/" + id, DepartmentDescription.class);
		DepartmentCatalogue departmentCatalogue = getCatalogue(id);

		return new Department(id, departmentCatalogue.getName(), departmentCount.getName(),
				departmentDescription.getDescription());
	}

	public List<Department> getListDepartment() {
		List<Department> list1 = new ArrayList<>();
		list.forEach(dc -> {

			DepartmentCount departmentCount = restTemplate.getForObject("http://department-count/count/" + dc.getId(),
					DepartmentCount.class);
			DepartmentDescription departmentDescription = restTemplate
					.getForObject("http://department-description/description/" + dc.getId(), DepartmentDescription.class);
			DepartmentCatalogue departmentCatalogue = getCatalogue(dc.getId());

			list1.add(new Department(dc.getId(), departmentCatalogue.getName(), departmentCount.getName(),
					departmentDescription.getDescription()));
		});
		return list1;

	}
	
	/*
	 * DepartmentCount[] deptC
	 * =restTemplate.getForObject("http://localhost:8447/count",
	 * DepartmentCount[].class); List<DepartmentCount> departmentCountList =
	 * Arrays.asList(deptC);
	 * 
	 * DepartmentDescription[] deptD =
	 * restTemplate.getForObject("http://localhost:8448/description/",
	 * DepartmentDescription[].class); List<DepartmentDescription>
	 * DepartmentDescriptionList = Arrays.asList(deptD);
	 * 
	 * List<DepartmentCatalogue> departmentCatalogueList = getCatalogueList();
	 */
}
