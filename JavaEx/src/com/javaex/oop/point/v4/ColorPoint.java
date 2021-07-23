package com.javaex.oop.point.v4;

public class ColorPoint extends Point {
	//추가 필드
	private String color;
	
	
	public ColorPoint() {
		this(10, 10, "red");
	}
	
	public ColorPoint(String color) {
		this(10,10,color);
	}
	
	public ColorPoint(int x, int y, String color) {
		// 명시적으로 부모 생성자를 선택
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 메서드 오버라이드
	@Override
	public void draw(boolean bShow) { // 물려 받았으나 자신만의 새로운 기능 덮어쓰기
		
		// 방법 1, 부모의 getter, setter를 이용
//		String message = String.format("색깔점[x=%d y=%d, color=%s]을 ",
//				super.getX(),
//				super.getY(),
//				color);
		// 방법 2. 부모의 필드를 protected로 변경
		String message = String.format("색깔점[x=%d y=%d, color=%s]을 ",
				x,
				y,
				color);
		
		message += bShow ? "그렸습니다." : "지웠습니다.";
		
		System.out.println(message);
		
	}
	
	// TODO: Point 클래스의 draw(boolean) 메서드를 오버라이드 해 보기.
}
