package com.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		char c = 'A';
		
		boolean isAEven = a % 2 == 0;
		boolean isBMultiple3 = b % 3 == 0;
		boolean r1 = isAEven && isBMultiple3;
		char r2 =  (char)(c + 4);
		
		System.out.println("a는 짝수입니까? " + isAEven);
		System.out.println("b는 3의 배수입니까 ? " + isBMultiple3);
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		
		
		

	}

}
