package com.javaex.oop.point.v4;

public class Point {
	protected int x;
	protected int y;
	

	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	//메소드 오버로딩
	// 매개 변수의 타입, 개수, 순서가 다르면 같은 이름의 메서드가 여러 개 존재할 수 있다.
	public void draw() {
		draw(true);
	}

	public void draw(boolean bShow) {
		String message = String.format("점[x=%d y=%d]을 ",x,y);
		
		message += bShow ? "그렸습니다." : "지웠습니다.";
		
		System.out.println(message);
		
	}
}
