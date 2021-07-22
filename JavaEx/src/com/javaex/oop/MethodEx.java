package com.javaex.oop;

public class MethodEx {

	public static void main(String[] args) {
//		printMessage();
		printMessage("Hello, Method");
		printDivide(10,0);
		System.out.println(divide(10,3)); // 자동으로 타입 변환 일어났음.(int -> double)
		System.out.println("getSum : " + getSum(new double[] {1,2,3,4,5,6,7,8,9}));
		System.out.println("getSum2 : " + getSum2(1,2,3,4,5,6,7));
		printSum("안녕", 1,2,3,4,5,6,7);
	}
	
	// 고정 인수가 앞에, 가변 인수가 뒤에
	private static void printSum(String message, double ...values) {
		for (double value : values) {
			System.out.println(message + value);
		}
	}
	
	// 매개 변수 갯수를 모른다. 
	// 방법1. 인수를 배열로 전달한다.
	private static double getSum(double[] values) {
//		double total = 0;
//		
//		for (double value : values) {
//			total += value;
//		}
//		
//		return total;
		
		return getSum2(values);
	}
	
	// 방법 2. 가변 인수 : 변수 이름 앞에 ...
	
	private static double getSum2(double ...values) {
		//가변 인수는 배열로 변환되어 돌아온다.
		double total = 0;
		
		for (double value : values) {
			total += value;
		}
		
		return total;
	}
	
	// 입력 O, 출력 O
	
	private static double divide(int num1, int num2) {
		return (double)num1 / num2;
	}
	
	
	// 입력 o, 출력 X
	
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없어요!");
			return; // 돌아가세요
		}
		System.out.println(num1 / num2);
	}
	
	// 입력 O, 출력 x
	private static void printMessage(String message) {
		System.out.println(message);
	}
	
	
	//입력 x, 출력 x
	private static void printMessage() {
		System.out.println("Hello, OOP");
	}

}
