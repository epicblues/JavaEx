package com.javaex.oop.shape.v1;

// 추상 클래스
// 자식 클래스에게 필드와 메서드를 돌려주는 ㅕ역할
// 그 자체로 객체화 될 수는 없다.

public abstract class Shape {
	
	// 필드
	
	protected int x;
	protected int y;
	
	// 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 최소 1개의 추상 메서드가 있어야 한다.
	// 상속받은 실제 클래스는 추상 메서드를 반드시 구현해야만 한다.
	
	public abstract double area();
	public abstract void draw();
}
