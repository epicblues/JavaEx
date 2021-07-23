package com.javaex.oop.point.v4;

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
		
		
		Point cp1 = new ColorPoint(10,20,"red");
		ColorPoint cp2 = new ColorPoint(30,40,"black");
		cp1.draw();
		cp1.draw(true);
		
		cp2.draw();
		cp2.draw(false);

	}

}
