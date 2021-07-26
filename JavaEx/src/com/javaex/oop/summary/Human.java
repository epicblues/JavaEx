package com.javaex.oop.summary;

public class Human extends Animal {

	
	// super()가 정의되지 않았기 때문에 기본 생성자를 컴파일러에서 만들 수 없어서 직접 정의해야 한다.
	public Human(String name) {
		super(name);
	}
	
	public Human(String name, int age) {
		// 명시적으로 부모 생성자 호출
		super(name,age);
	}

	@Override
	public void say() {
		// Animal 클래스의 추상 메서드
		System.out.printf("안녕 나는 %s입니다.%n", name);
	}

}
