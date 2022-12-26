package com.shambhu.section03;

public class Employee {

	Integer empId;
	String empName;
	
	
	
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}



	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
