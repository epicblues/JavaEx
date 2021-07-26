package com.javaex.api.objectpractice;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle other = (Circle)obj;
			return radius == other.radius ? true : false;
		}
		return false;
	}
}
