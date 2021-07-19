package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
		arithOperEx(); 

	}
	
	// 산술 연산
	private static void arithOperEx() { 
		int a = 7, b = 3;
		
		// 부호 연산자 : +, -
		System.out.println(-a);
		
		// 사칙연산 : +, -, *, /
		System.out.println(a / b); // int / int => int
		System.out.println(a % b); // 정수 나눗셈의 나머지.
		System.out.println((float)a / b);
		
		// 증감 연산자; ++, --
		// 전치 증감(++a 등), 후치 증감(b-- 등) 혼동하지 말자.
		
		int num = 10;
		//전치 증감
		System.out.println("num: " + num);
		System.out.println("++numc: " + ++num);
		System.out.println("num: " + num);		
		
		//후치 증감
		System.out.println("num: " + num);
		System.out.println("num++: " + num++);
		System.out.println("num: " + num);
		
		// 나눗셈 보충
		try {
		System.out.println(4 / 0) ; // 산술 예외 발생
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(4.0 / 0); // Infinity
		System.out.println(4.0 / 0 + 10); // Infinity 포함된 연산 -> Infinity
		System.out.println(Double.isNaN(0.0 / 0 + 10));
		
		// 우리의 연산식의 결과가 Infinity인지 확인.
		System.out.println(Double.isInfinite(4.0/0));
		System.out.println(Double.isNaN(0.0/0.0));
		System.out.println("End of Code");
	}
}
	
		
