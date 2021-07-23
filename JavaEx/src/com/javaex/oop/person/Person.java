package com.javaex.oop.person;

public class Person {
	
	protected String name;
	protected int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person() {
		this("없음",0);
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("이름 : %s%n나이: %d%n",name,age);
	}
	
}
