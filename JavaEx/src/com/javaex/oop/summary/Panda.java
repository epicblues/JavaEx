package com.javaex.oop.summary;

public class Panda extends Animal {
	
	
	//생성자
	public Panda(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.printf("%s : zzzzzzz%n",name);
		
	}

}
