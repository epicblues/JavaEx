package com.javaex.basics;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		doWhileEx();
//		forGugu();
//		continueEx();
		loopEx2();
//		System.out.println("End of Code");
	}

	private static void loopEx() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<10;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
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
