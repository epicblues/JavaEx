package com.javaex.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		
		// 객체 복제 테스트
		Point p = new Point(10, 20);
		Point p2 = p; // 참조 복제
		
		System.out.println("p1 = " +p);
		System.out.println("p2 = " +p2);
		System.out.println();
		
		
		// p2를 변경
		p2.x = 100;
		System.out.println("p1 = " +p);
		System.out.println("p2 = " +p2);
		// 참조 복제는 그냥 같은 객체를 참조하는 것.
		

	}

}
