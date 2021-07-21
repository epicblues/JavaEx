package com.javaex.basics;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;



public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElsePractice();
//		switchEx();
//		switchEx2();
//		conditionalPractice01();
//		conditionalPractice02();
		DayOfWeek day = DayOfWeek.SUNDAY;
		switchEx3(day);
	}
	
	private static void switchEx3(DayOfWeek day) {
		// day가 SUNDAY -> 휴식
		// day가 MONDAY ~ THURSDAY -> 열공
		// FRIDAY -> 열공 후 불금
		// SATURDAY -> 주말
		// 그 이외 -> ?
		
		// TODO : 이 코드는 나중에 enum 타입으로 개선해 볼 예정.
		String act;
		switch (day.ordinal()) {
		case 0:
			act = "휴식";
			break;
		case 1:
		case 2:
		case 3:
		case 4:
			act= "열공";
			break;
		case 5:
			act = "열공 후 불금";
			break;
		case 6:
			act = "주말";
			break;
		default:
			act = "?";
		}
		System.out.println(day+ "에는 " +act);
	}
	
	
	private static void conditionalPractice01() {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		
		if( score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println(score + "는 3의 배수가 아닙니다.");
		}
	}
	
	private static void conditionalPractice02() {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		String grade;
		if( score >=90 ) {
			grade = "A등급";
		} else if (score >=80 ) {
			grade = "B등급";
		} else if (score >=70 ) {
			grade = "C등급";
		} else if (score >=60 ) {
			grade = "D등급";
		} else  {
			grade = "F등급";
		}
		System.out.println(grade);
		scan.close();
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
