package com.javaex.basics;

// 변수 예제,
// 데이터 타입 예제
public class Types {
	
	public static void main(String[] args) {
//		varEx();
//		integerEx();
//		floatDoubleEx();
		booleanEx();
	}

	// 논리형 데이터 타입
	private static void booleanEx() {
		// 1byte: true or false
		// 조건 분기, 반복문 등에 활용 -> 중요한 자료형.
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 + "," + b2);
		
		// 비교 연산, 논리 연산의 결과로 활용
		
		int a = 7, b = 3;
		boolean result = a>b;
		
		System.out.println(result);
	}
	
	// 실수형 데이터 타입
	private static void floatDoubleEx() {
		//float(4) < double(8)
		float floatVar; double doubleVar;
		floatVar=3.14159f;
		doubleVar=3.14159;
		
		
		System.out.println(floatVar);
		System.out.println(doubleVar);
		
		// 지수 표기법
		
		doubleVar=3e10; // 3 * 10 ^ 10
		floatVar=3e-6f; // 3* 10 ^ -6
		System.out.println(doubleVar);
		System.out.println(floatVar);
		
		// 부동 소수점 계산의 문제
		// float, double은 정밀도를 포기하고 
		// 표현 범위만 넓힌 것
		// 정밀 실수 처리에는 적합하지 않다.
		
		System.out.println(0.1 * 3);
		
	}
	
	
	
	// 정수형 데이터 타입
	private static void integerEx() {
		
		// byte(1)<short(2)<int(4)<long(8)
		int intVar1, intVar2; // 선언
		
		intVar1=2021; // 초기화
		//intVar2=1234567890123;   out of range : 저장범위 초과
		System.out.println(Integer.toBinaryString(intVar1));
		
		long longVar1, longVar2;
		longVar1 = 2021;
		longVar2 = 1234567890123L;
		System.out.println(Long.toBinaryString(longVar2));
		
		int bin, oct, hex;
		bin = 0b1101; // 2진수 0b 접두어
		oct = 072; // 8진수 0 접두어
		hex = 0xFF; // 16진수 0x 접두어
		
		System.out.println(bin + "," + oct + "," + hex);
	}
		
		
	// 변수의 선언과 사용
	private static void varEx() {
		/* 변수의 식별자 규칙
		 * 1.문자, 숫자, $, _ 사용할 수 있다.
		 * 2.숫자로 시작할 수 없다.
		 * 3.예약어는 사용할 수 없다.
		 * 4.camelCase로 작성.
		 */
		
		int age=30;	// 선언(특정 메모리 공간에 이름을 붙였다. 4byte) + 초기화
		// 자바는 정적 타입 언어이기 때문에 다른 타입의 데이터를 담을 수 없다.
		// age=3.14 -> error
		
		// 조회:
		System.out.println("내 나이는 " + age +"살");
		
		// 한번에 여러 변수를 선언하고자 할 때
		int v1=10, v2 = 20, v3 =30;
		
		// 여러 변수에 동일한 값을 할당하고자 할 때
		v1 = v2 = v3 = 40; // 뒤에서 부터 실행된다고 보면 된다? 40을 먼저 v3에 대입 ...
	
		

	}
	
}
