package com.javaex.basics;

// 변수 예제,
// 데이터 타입 예제
public class Types {
	
	public static void main(String[] args) {
		varEx();
		
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
