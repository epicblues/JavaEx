package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forGugu();
//		continueEx();
//		forGuguPractice();
//		whileStarPractice();
		breakEx();
		
//		forGuguPractice();
//		loopEx2();
//		System.out.println("End of Code");
	}
//	TODO: say hello
	private static void breakEx() {
		int num = 1;
		
		while (true) {
			if (num % 6 == 0 && num % 14 == 0) {
				break;
			}
			num++;
		}
		
		System.out.println(num);
	}
	
	private static void forGuguPractice() {
		// 단 루프
		for (int dan =2 ; dan <=9; dan++) {
			//숫자 루프
			for (int num=1; num<=9; num++) {
				System.out.println(dan + " * " + num + " = " + dan*num);
			}
		}
	}
	
	private static void whileGuguPractice() {
		int dan = 2;
		
		while(dan <= 9) {
			int num = 1;
			while(num <= 9) {
				System.out.println(dan + " * " + num + " = " + dan*num);
				num++;
			}
			dan++;
		}

		
	}
	
	private static void forStarPractie() {
		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void whileStarPractice() {
		int row = 1;
		// 행 루프
		while (row <= 6) {
			//열 루프
			int col = 1;
			while(col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println(); // 한 행 끝난 후 개행
			row++;
		}
	}
	
	
	private static void loopEx2() {
		for(int j=1; j<=6; j++) {
			for(int i=0; i<j;i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	private static void continueEx() {
		for (int i = 1; i <= 20; i++) {
			//2의 배수, 3의 배수는 출력하지 않음.
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	private static void forGugu() {
		System.out.print("단 : ");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();

		for (int i = 1; // 초기화
				i <= 9; // 반복 조건
				i++ // 증감식
				) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

		scan.close();
	}

	private static void doWhileEx() {
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		Scanner scan = new Scanner(System.in);
		int value = 0;
		int total = 0;
		do {
			value = scan.nextInt();
			total += value;
			System.out.println("합계 : " + total);
		} while (value != 0);

		System.out.println("종료");
		scan.close();
	}

	private static void whileGugu() {
		System.out.print("단 : ");
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();

		int i = 1;
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + dan * i);
			i++;
		}
		scan.close();
	}

	private static void whileEx() {
		int i = 0; // 반복 조건 제어 변수
		while (i <= 4) {
			System.out.println("I like java" + i);
			i++; // 주의 : 무한 반복에 빠지지 않도록 적당히 제어.
		}

	}

}
