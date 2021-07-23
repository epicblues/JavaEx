package com.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int maxNum = 0;
		int inputNum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			inputNum = scan.nextInt();
			if (inputNum > maxNum) {
				maxNum = inputNum;
			}
		}
		scan.close();
		System.out.println("최대값은 " + maxNum + "입니다.");

	}

}
