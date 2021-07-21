package com.javaex.basics.reftypes;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		defineArray();
	}

	private static void defineArray() {
		// 선언
		String[] names; // 타입[] 식별자
		int scores[]; // 타입 식별자[]

		// 일반적인 방법
		scores = new int[4]; // 사이즈 지정.
		// 인덱스 접근
		// 범위: 0 ~ .length - 1
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100; // ArrayIndexOutOfBoundsException;
		
		// 데이터를 가지고 있다
		// 			-> 배열의 사이즈를 지정할 필요 없음.
		names = new String[] {"홍길동", "임꺽정", "장길산", "전우치"};
		
		// 데이터를 가지고 있다, 선언과 동시에 초기화 할 때
		float heights[] = {175.3f, 180.5f, 190.2f, 165.2f };
		
		// .length : 배열의 길이
		System.out.println("names의 길이: " + names.length);
		
		// index는 0부터 .length - 1 까지
		for(int i=0; i < names.length; i++) {
			System.out.printf("%s, (%.2f) : scores = %d%n", names[i],heights[i],scores[i]);
		}
		
		// 배열은 참조 타입이다.
		int scores2[] = scores;
		
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
		
		scores[2] = 0;
		
		System.out.println("scores: " + Arrays.toString(scores));
		System.out.println("scores2: " + Arrays.toString(scores2));
	}

}
