package com.shambhu.employee.ex3;

<<<<<<< HEAD

//ShambhuKumarJayswal
=======
//ShambhuKumar
>>>>>>> 3bad8edff7a4b70b8c6aba90634f4caa0b90c867
public class Employee {

	private Integer eno;
	private String ename;
	private Integer salary;
	private String city;
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", city=" + city + "]";
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(Integer eno, String ename, Integer salary, String city) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.city = city;
	}
	
	

}
