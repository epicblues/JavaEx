package com.javaex.basics;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElsePractice();
//		switchEx();
		switchEx2();
	}
	
	private static void conditionalPractice01() {
		
	}
	
	private static void conditionalPractice02() {
		
	}
	
	private static void switchEx2() {
		//월 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		
		int month = scan.nextInt();
		int days = 0;
		
		switch (month) {
		case 2:
			days = 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		default :
			days = 30;
		}
		
		System.out.println(days + "일입니다.");
		scan.close();
		
	}
	
	private static void switchEx() {
		Scanner scan = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목 번호 : ");
		int num = scan.nextInt();
		
		String message;
		switch (num) {
		case 1:
			message = "R101";
			break;
		case 2:
			message = "R202";
			break;
		case 3:
			message = "R303";
			break;
		case 4:
			message = "R404";
			break;
		default:
			message = "상담원에게 문의하세요";
			break;
		}
		
		System.out.println(message);
		
		scan.close();
	}
	
	
	private static void ifElseEx() {
		// Scanner로 정수 입력
		// 0, 양수, 음수
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = Integer.parseInt( scan.next()); // 문자열로 받아들인 다음에 정수로 변환.
		// 조건 분기
		// 양수 체크 -> 음수 체크 -> 0
		/*
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if(num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		*/
		
		// 중첩 if
		// 0체크 -> 0이 아닌 것 (양수와 음수 구분)
	
		if (num == 0) 
			System.out.println("0입니다.");
		else  {
			// 0아 아닌 것
			if(num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
			
		} 
		scan.close();
}
	
	
	private static void ifElsePractice() {
		Scanner scan = new Scanner(System.in);
		System.out.println("과목을 선택하세요.");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목 번호 : ");
		int num = scan.nextInt();
		
		String message;
		if (num== 1)
			message = "R101";
		else if (num== 2)
			message = "R202";
		else if (num== 3)
			message = "R303";
		else if (num== 4)
			message = "R404";
		else
			message = "상담원에게 문의하세요";
			
		System.out.println(message);
		
		scan.close();
		
	}

}
