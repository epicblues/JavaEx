package com.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
		
		int sum = 0;
		for (int value : array) {
			sum += value;
		}
		System.out.printf("평균은 %.1f 입니다", sum/5.0f);
		scan.close();

	}

}
