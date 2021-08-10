package com.javaex.jdbc.oracle.dao.HR;

public class SalaryVO {
	private String fullName;
	private Integer salary;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public SalaryVO(String fullName, Integer salary) {
		super();
		this.fullName = fullName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "SalaryVO [fullName=" + fullName + ", salary=" + salary + "]";
	}
	
	
}
