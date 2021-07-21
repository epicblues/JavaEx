package com.practice01;
import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		int sum = 0;
		if (inputNum % 2 == 0) {
			for (int i=0; i <= inputNum; i++,i++) {
				sum += i;
			} 
		} else {
			for (int i=1; i <= inputNum; i++,i++) {
				sum += i;
			}
		}
		System.out.println("결과값: " +sum);

	}

}
