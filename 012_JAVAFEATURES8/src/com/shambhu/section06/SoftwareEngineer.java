package com.shambhu.section06;

public class SoftwareEngineer {
	
	private String name;
	private Integer age;
	private boolean isHavingGF;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isHavingGF() {
		return isHavingGF;
	}
	public void setHavingGF(boolean isHavingGF) {
		this.isHavingGF = isHavingGF;
	}
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + "]";
	}
	public SoftwareEngineer(String name, Integer age, boolean isHavingGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGF = isHavingGF;
	}
	
	
	

}
