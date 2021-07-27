package com.javaex.api.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		arrayCopyEx();
	}

	// 복사
	private static void arrayCopyEx() {
		char[] src = "Java Programming".toUpperCase().toCharArray();

		System.out.println(Arrays.toString(src));

		// 방법 1. 루프 돌려 복사

		char[] target = new char[src.length];

		for (int i = 0; i < src.length; i++) {
			target[i] = src[i];
		}

		System.out.println("루프 복사 : " + Arrays.toString(target));

		// 방법 2. 시스템

		target = new char[src.length];
		System.arraycopy(src, 0, // 복사 시작 위치(원본 배열)
				target, // 복사 대상 배열
				0, // 대상 배열의 복사 시작 위치
				src.length // 복사 길이
		);
		System.out.println("System 복사 : " + Arrays.toString(target));

		// 방법 3. Arrays.copyOf()
		
		target = Arrays.copyOf(src, src.length);
		System.out.println("Arrays.copyOf 복사 : " + Arrays.toString(target));
		
		// 방법 4. Arrays.copyOfRange()
		
		target = Arrays.copyOfRange(src,
				0, // 시작 위치
				src.length);
		System.out.println("Arrays.copyOfRange 복사 : " + Arrays.toString(target));
	}
}
