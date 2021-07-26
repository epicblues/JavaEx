package com.javaex.exception;

// 사용자 정의 예외
public class CustomArithmeticException extends ArithmeticException {
	// 필드 : 예외 상황의 데이터 확인 혹은 환경 정보
	private int num1;
	private int num2;
	
	//생성자 
	public CustomArithmeticException(String message,int num1, int num2) {
		super(message); // 부모 초기화.
		this.setNum1(num1);
		this.setNum2(num2);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
}
