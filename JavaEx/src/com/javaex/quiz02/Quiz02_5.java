package com.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		int num1 = 13579;
		int num2 = 13579;
		
		String result = ++num1 + 1 == num2++ +1 ? "같음" : "다름";
		System.out.println(result);
		
		System.out.println("최종 num1 : " + num1);
		System.out.println("최종 num2 : " + num2);
	}

}
