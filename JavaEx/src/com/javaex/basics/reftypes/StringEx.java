package com.javaex.basics.reftypes;

public class StringEx {

	public static void main(String[] args) {

//		stringType();
		stringFormatEx();

	}

	private static void stringFormatEx() {
		// %d(정수), %s(문자열), %n(개행), %%(%), %f(실수)
		String food = "사과";
		int total = 10, eat = 3;
		
		// total 개의 food 중에서 eat 개를 먹었다.
		System.out.println(total + "개의 " + food + " 중에서 " + eat + "개를 먹었다.");
		
		// 템플릿
		String fmt = "%d개의 %s 중에서 %d개를 먹었다.%n";
		System.out.printf(fmt, total,food,eat);
		
		String message = String.format(fmt, 5,"버거",2);
		System.out.print(message);

		// 부가 정보를 가지기도 한다.
		float rate = 1.234567f;
		System.out.printf("이자율은 %.2f%%입니다. ",rate); // 소수점 2자리까지 읽기.
	}

	private static void stringType() {
		// 문자열 선언
		String str; // 선언
		str = "Java"; // 리터럴(소스에 직접 입력된 것)
		String str2 = "Java"; // 리터럴
		String str3 = new String("Java");

		// 참조 타입에서 == 은 참조 주소가 같은지(같은 객체인지) 판별.
		System.out.println("str==str2 ? " + (str == str2));
		System.out.println("str==str3 ? " + (str == str3));

		// 값 .equals()

		System.out.println("str과 str2의 내용이 같은가 ? " + str.equals(str2));
		System.out.println("str과 str3의 내용이 같은가 ? " + str.equals(str3));

		String str4; // 선언했으나 할당되지 않음.
//		str4.equals(str);
		// null 상태의 객체의 메서드를 이용하고자 하면 에러 발생.
		// NullPointerException (보통을 컴파일러에서 거르지만 외부의 객체를 사용할 때 자주 발생하는 예외)
	}

}
