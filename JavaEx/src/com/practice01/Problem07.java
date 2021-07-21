package com.practice01;
import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("=========================");
			System.out.println("    [숫자맞추기 게임 시작]     ");		
			System.out.println("=========================");
			int answer = (int)(Math.random()*100) + 1;
			int inputNum = 0;
			
			while(true) {
				System.out.print(">>");
				inputNum = scan.nextInt();
				if (inputNum > answer) {
					System.out.println("더 낮게");
				} else if (inputNum< answer) {
					System.out.println("더 높게");
				} else {
					System.out.println("맞았습니다");
					break;
				}
			}
			System.out.print("게임을 반복하시겠습니까?(y/n) >>");
			String yesNo = scan.next();
			if (yesNo.equals("y") ) {
				continue;
			} else if(yesNo.equals("n")) {
				run = false;
			}
		}
		scan.close();
		System.out.println("=========================");
		System.out.println("    [숫자맞추기 게임 종료]     ");		
		System.out.println("=========================");
		
	}

}
