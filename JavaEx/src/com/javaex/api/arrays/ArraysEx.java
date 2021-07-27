package com.javaex.api.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



public class ArraysEx {

	public static void main(String[] args) {

//		arrayCopyEx();
//		basicSortTest();
//		basicSortDescTest();
//		customClassSortTest();
//		basicSearchEx();
		searchCustom();
	}

	// 검색(기본 타입 클래스)
	private static void basicSearchEx() {
		// 자바는 이진 검색 방식을 사용한다.
		Integer[] nums = {5,3,1,7,8,6,4,9,2};
		// 이진 검색은 검색이전에 이미 오름차순으로 정렬 되어 있어야 한다.
		Arrays.sort(nums);
		int inx = Arrays.binarySearch(nums, 1);
		System.out.println("정렬된 배열 :  " + Arrays.toString(nums));
		System.out.println("1의 인덱스 : " + inx); 
		
		String[] str = {"Java", "C", "C++", "Python", "Linux"};
		System.out.println("원본 배열 : " + Arrays.toString(str));
		Arrays.sort(str); // 배열을 검색 전에 오름차순으로 정렬해야 한다.
		inx = Arrays.binarySearch(str,"C++");
		System.out.println("정렬된 배열 : " + Arrays.toString(str));
		System.out.println("C++ 의 인덱스 : " + inx);
		
	}
	
	//검색(사용자 정의 클래스)
	private static void searchCustom() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정"),
				new Member("전우치"),
		};
		
		System.out.println("원본 배열 : " + Arrays.toString(members));
		Arrays.sort(members);
		System.out.println("정렬된 배열 : " + Arrays.toString(members));
		System.out.println("홍길동 위치 : " + Arrays.binarySearch(members, new Member("홍길동"), new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		}));
		
	}
	
	
	// 사용자 정의 클래스 정렬
	
	private static void customClassSortTest() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("장길산"),
				new Member("임꺽정"),
				new Member("전우치"),
		};
		System.out.println("원본 : " + Arrays.toString(members));
		Arrays.sort(members,Collections.reverseOrder());
		System.out.println("정렬본 : " + Arrays.toString(members));
		
	}
	
	// 기본 타입 정렬
	private static void basicSortTest() {
		int[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("배열 원본 : " + Arrays.toString(scores));
		Arrays.sort(scores); // 기본 정렬 : 오름차순
		System.out.println("기본 정렬(오름차순) : " + Arrays.toString(scores));
		
	}

	// 기본 타입 역순 정렬
	private static void basicSortDescTest() {
		Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("배열 원본 : " + Arrays.toString(scores));
		Arrays.sort(scores, Collections.reverseOrder()); // compareTo라는 것으로 비교를 하는데 기본 타입으로는 불가능. Integer 객체는 compareTo가 있다.
		System.out.println("기본 정렬(내림차순) : " + Arrays.toString(scores));
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

		target = Arrays.copyOfRange(src, 0, // 시작 위치
				src.length);
		System.out.println("Arrays.copyOfRange 복사 : " + Arrays.toString(target));
	}
}
