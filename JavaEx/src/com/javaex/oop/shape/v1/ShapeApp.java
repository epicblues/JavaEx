package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상 클래스는 객체화 할 수 없다.
		
		Shape r1 = new Rectangle(10,10,100,50);
		r1.draw();
		
		Shape c1 = new Circle(10,20,30);
		c1.draw();

	}

}
