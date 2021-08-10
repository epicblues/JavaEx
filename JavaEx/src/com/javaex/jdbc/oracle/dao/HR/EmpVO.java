package com.javaex.jdbc.oracle.dao.HR;

public class EmpVO {
	private String fullName;
	private String email;
	private String phone;
	private String hireDate;
	public String getFullName() {
		return fullName;
	}
	public EmpVO(String fullName, String email, String phone, String hireDate) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.hireDate = hireDate;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
}
