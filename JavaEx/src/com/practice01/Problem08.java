package com.practice01;
import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		int balance = 0;
		boolean run = true;
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("------------------------");
			System.out.print("선택>");
			
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("예금액>");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			} 
		}
	}

}
