package com.javaex.api.objectclass.v2;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			return width * height == other.width * other.height ? true : false;
		} 
			return super.equals(obj);
		
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}
