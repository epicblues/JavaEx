package com.javaex.basics;

public class OperatorEx {

	public static void main(String[] args) {
//		arithOperEx(); 
//		logicOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionalOperEx();
	}
	// 3항 연산자
	
	public static void conditionalOperEx( ) {
		// 문법이 조건식 ? 참일때의 값 또는 식 : 거짓일 때의 값 또는 식
		int a = 9;
		
		String result;
		
		// a가 짝수이면 "짝수", 홀수면 "홀수" 출력
		result = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println("a는 " + result);
		
		int score = 60;
		// 만약에 score >= 80 -> Good
		// 만약에 score >= 50 -> Pass
		// 50점 미만 -> Fail
		
		result = score>=80 ? "Good" : score>=50 ? "Pass" : "Fail";
		System.out.println("Score: " + score + " result: " +result);
	}
	// 비트 시프트 연산자
	private static void bitShiftOperEx() {
		// 비트 단위로 이동.
		int val = 1;
		// 왼쪽 시프트 <<
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val <<5));
		System.out.println(Integer.toBinaryString(val <<2));
		
		// 우측 시프트 >>
		val = -2021;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 5)); // MSB 유지
		System.out.println(Integer.toBinaryString(val >>> 5));
	}
	
	
	// 비트 연산자
	private static void bitOperEx()  {
		// 하드웨어 제어, 이미지 처리 등
		// 미세하게 비트 단위 데이터 제어에 활용.
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		
		System.out.println("b1 : " + Integer.toBinaryString(b1));
		System.out.println("b2 : " + Integer.toBinaryString(b2));
		
		int result = b1 & b2;
		System.out.println("b1 & b2 : " + Integer.toBinaryString(result));
		
		result = b1 | b2; // 비트 논리합
		System.out.println("b1 || b2 : " + Integer.toBinaryString(result));
		
		result = ~b1; // 비트 논리 부정
		System.out.println("~b1 : " + Integer.toBinaryString(result));
		
		result = b1 ^ b2; // 배타적 논리합
		System.out.println("b1 ^ b2 : " + Integer.toBinaryString(result));
		
	}
	
	
	
	// 비교 연산과 논리 연산
	
	
	private static void logicOperEx() {
		int a = 7, b =3;
		
		// 비교 연산자: >, >=, <, <=, ==, !=
		System.out.println("a > b ? " + (a>b));
		System.out.println("a와 b가 같습니까? " + (a==b));
		System.out.println("a와 b가 다릅니까? " + (a!=b));
		
		// 논리 연산자: 논리곱 (AND : &&), 논리합(OR : ||), 논리 부정(NOT : !)
		
		int num = 5;
		// num : 0 초과 10 미만의 값인가?
		//			조건1 : num> 0
		//			조건2 : num < 10
		// 결과 : 조건1 && 조건2
		boolean r1 = num > 0 ;
		boolean r2 = num < 10 ;
		boolean r1Andr2 = r1 && r2;
	
		
		System.out.println(r1Andr2);
		
		// num : 0 이하 이거나 10 이상의 값인가?
		//		조건 1 : num <= 0
		//		조건 2 : num >= 10
		boolean r3 = !r1;
		boolean r4 = !r2;
		boolean r3Orr4=r3 || r4;
		System.out.println(r3Orr4);
		System.out.println(!r3Orr4);
		
		// 논리 부정;
		// num > 0 && num < 10 -> 논리 부정.
		// num <= 0 || num >= 10
		
		boolean rNot = !(num > 0 && num <10);
		System.out.println("num가 0초과, 10 미만 이외의 값인가 " + rNot);
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
	
		
