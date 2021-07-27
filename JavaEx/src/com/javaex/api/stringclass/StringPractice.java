package com.javaex.api.stringclass;

public class StringPractice {

	public static void main(String[] args) {
		String str = "aBcAbCabcABC";
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf("abc"));
		System.out.println(str.length());
		System.out.println(str.replace('a', 'R'));
		System.out.println(str.replace("abc", "123"));
		System.out.println(str.substring(0, 3));
		System.out.println(str.toUpperCase());

	}

}
