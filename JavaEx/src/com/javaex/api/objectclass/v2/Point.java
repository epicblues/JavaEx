package com.javaex.api.objectclass.v2;


// v1. 모든 클래스의 최상의 부모는 Object이다.
//	toString : 객체를 문자열로 출력할 때 호출되는 메서드
// extends java.lang.Object 하지 않아도 자동으로 상속되어 있다.

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// 객체 출력 포맷을 리턴한다.
		return String.format("Point(%d, %d)", x,y);
	}

	@Override
	public boolean equals(Object obj) {
		// 전달받은 obj가 Point 클래스의 객체?
		if(obj instanceof Point) {
			// 캐스팅 가능
			Point other = (Point)obj;
			return x == other.x && y == other.y ? true : false;
		} else {
			return false;
		}

	}
	
	
	
}
