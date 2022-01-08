package com.rchinnat.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {

	@Id
	@SequenceGenerator(
			name = "department_sequence",
			sequenceName = "department_sequence",
			initialValue = 1001,
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "department_sequence"
	)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
}
