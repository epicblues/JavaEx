package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	
	// 필드
	protected double radius;

	
	// 생성자
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	
	// 추상 메서드.
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다%n"
				,x,
				y,
				radius,
				area()
				);

	}

}
