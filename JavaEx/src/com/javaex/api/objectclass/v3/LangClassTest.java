package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {

		// 객체 복제 테스트
		Point p = new Point(10, 20);
//		Point p2 = p; // 참조 복제
		Point p2 = p.getClone();

		System.out.println("p1 = " + p);
		System.out.println("p2 = " + p2);
		System.out.println();

		// p2를 변경
		p2.x = 100;
		System.out.println("p1 = " + p);
		System.out.println("p2 = " + p2);
		System.out.println();
		// 참조 복제는 그냥 같은 객체를 참조하는 것.

		Rectangle r = new Rectangle(10, 20);
		Rectangle r2 = r.getClone();

		System.out.println(r);
		System.out.println(r2);
		System.out.println(r.equals(r2));
		System.out.println();

		r2.width = 30;
		r2.height = 40;

		System.out.println(r);
		System.out.println(r2);
		
		System.out.println(r.equals(r2));

	}

}
