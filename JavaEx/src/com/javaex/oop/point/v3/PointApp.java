package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point point1 = new Point(10,10);
		point1.draw();
		point1.draw(true);
		point1.draw(false);
		
		Point point2 = new Point(20,30);
		point2.draw();
		point2.draw(true);
		point2.draw(false);
		

	}

}
