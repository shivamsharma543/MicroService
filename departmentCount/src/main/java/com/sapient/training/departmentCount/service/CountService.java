package com.sapient.training.departmentCount.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.training.departmentCount.model.departmentCount.DepartmentCount;




@Service
public class CountService {

	List<DepartmentCount> list=new ArrayList(Arrays.asList(new DepartmentCount(1,5),
                                                           new DepartmentCount(2,4),
                                                           new DepartmentCount(3,3)));
	
	public DepartmentCount getCountById(int id) {
		return list.stream().filter(c->c.getId()==id).findFirst().get();
		
	}
	
	public List<DepartmentCount> getCount(){
		return list;
	}
	
	
}
