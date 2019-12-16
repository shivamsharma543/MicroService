package com.sapient.training.departmentDescription.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.training.departmentDescription.model.departmentDescription.DepartmentDescription;

@Service
public class DescriptionService {

	List<DepartmentDescription> list=new ArrayList(Arrays.asList(new DepartmentDescription(1,"Physics Lab"),
			                                                     new DepartmentDescription(2,"Chimstry Lab"),
			                                                     new DepartmentDescription(3,"JAVA Lab")));
	
	public DepartmentDescription getDescriptionById(int id) {
		return list.stream().filter(c->c.getId()==id).findFirst().get();
		
	}
	
	public List<DepartmentDescription> getDescription(){
		return list;
	}
}
