package com.javaex.basics.reftypes;

import java.util.Calendar;
import java.util.Date;

public class EnumEx {

	public static void main(String[] args) {
		enumEx1();

	}
	
	public static void enumEx1() {
		// 열거 상수 사용
		
		Week today = Week.WEDNESDAY;
		
		System.out.printf(
				"오늘은 %s(%d) 입니다.%n",
				today.name(), // 열거 상수 -> 문자열
				today.ordinal() // 열거 상수 -> 순번
				);
		
		Week obj = Week.valueOf("FRIDAY");
		
		System.out.printf("%s, %d", obj.name(),obj.ordinal());
		
	}

}
