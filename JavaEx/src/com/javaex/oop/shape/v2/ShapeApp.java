package com.javaex.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상 클래스는 객체화 할 수 없다.
		
		Rectangle r1 = new Rectangle(10,10,100,50);
		r1.draw();
		
		Drawable c1 = new Circle(10,20,30);
		c1.draw();
		
		Drawable pt = new Point(10,10);
		pt.draw();
		
		// 그림판에서는 그리기 객체를 관리할 수 있어야 한다.
		
		Drawable[] objs = {
				r1,c1,pt,new Rectangle(30,40,20,30),
				new Circle(100,50,30),
				new Point(40,50)
		};
		
		for (Drawable obj : objs) {
			obj.draw();
		}
	}

}
