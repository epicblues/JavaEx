package com.practice01;
import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int countMax = scan.nextInt();
		for (int i = 1; i <= countMax; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		scan.close();

	}

}
