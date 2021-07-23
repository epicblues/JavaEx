package com.javaex.oop.person;

public class Student extends Person{
	private String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public Student(String schoolName) {
		this("없음",0,schoolName);
	}
	
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.printf("학교 : %s%n", schoolName);
	}
}
