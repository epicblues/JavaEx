package com.javaex.oop.summary;

public abstract class Animal {
	// 필드
	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public Animal(String name, int age) {
		// 자신의 다른 생성자 호출
		this(name);
		this.age = age;
	}
	
	// 메서드
	public void eat() {
		System.out.printf("%s is eating... %n", name);
	}
	
	// 추상 메서드: 선언만 한다. 반드시 1개 이상 있어야 한다. 
	// 자식 클래스에서 override 해줘야 한다.
	public abstract void say();
}
