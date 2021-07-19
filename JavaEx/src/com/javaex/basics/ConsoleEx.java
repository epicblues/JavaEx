package com.javaex.basics;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
//		consoleOutputEx();
//		consoleInputEx();
		consoleInputPractice();
	}
	
	private static void consoleInputPractice() {
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.print("나이: ");
		int age = scan.nextInt();
		scan.close(); 
		System.out.println("이름은 " + name + ", 나이는 " + age + "입니다.");
	}
	
	
	private static void consoleInputEx() {
		System.out.println("이름을 입력해 주세요.");
		System.out.print("이름: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		scan.close(); // System.in에 대한 연결 종료. 시스템 자원을 사용하는 클래스는 사용 이후 반드시 닫아주자.
		System.out.println("이름은 " + name + "입니다.");
	}
	
	private static void consoleOutputEx() {
		// 표준 출력 : stdout -> System.out
		// 표준 에러 : stderr -> System.err
		
		// 출력 메서드
		// print : 개행 안함
		// println : 개행 한다 -> print \n
		// printf : 형식화된 출력 -> String
		
		System.out.print("hello "); // 개행 안한다.
		System.out.println("Java"); // 개행 한다.
		
		// 이스케피으 문자 (\) -특수한 의미
		System.out.println("hello\tJava"); // \t 탭
		System.out.println("hello\nJava"); // \n 강제 개행
		
		String message = "hello, \"Java\"";
		System.out.println(message);
		
		// \\ => \
		
		String path = "C:\\Users\\bit\\Document"; 
		System.out.println(path);
		System.err.println("표준 에러 출력");
		
		
		
	}

}
