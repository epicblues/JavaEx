package com.javaex.oop.staticmember;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
	
	
	// 인스턴스 멤버
	public void instanceMethod() {
		
	}
	
	
	// 생성자
	private Singleton() {
		// 외부에서 new로 인스턴스 생성 불가.
		// 여기서만 호출할 수 있다.
	}
}
