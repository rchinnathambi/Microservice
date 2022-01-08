package com.rchinnat.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rchinnat.department.entity.Department;
import com.rchinnat.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	public static final Logger logger = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		logger.info("Inside saveDepartment method in DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		logger.info("Inside findDepartmentById method in DepartmentService:" + departmentId);
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
