package com.javaex.api.collection.list;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터 생성
		// 버퍼 기반
		Vector<Integer> v = new Vector<>(); // 기본 버퍼 : 10
		// new Vector<>(용량)
		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());

		for (int i = 1; i <= 10; i++) {
			v.addElement(Integer.valueOf(i)); // 항목 추가
		}
		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());

		v.addElement(Integer.valueOf(11)); // 허용량 초과 -> 버퍼 자동 증가.

		System.out.printf("size : %d, capacity : %d%n", v.size(), v.capacity());

		// 중간에 값을 넣기
		v.insertElementAt(100, 7);
		System.out.println("v: " + v);

		// 객체 조회 : 찾는 인덱스의 객체를 반환
		int value = v.elementAt(7);
		System.out.println("index 7 의 객체 : " + value);

		// 객체의 인덱스 조회
		System.out.println("7의 index : " + v.indexOf(7));
		System.out.println("0의 index : " + v.indexOf(0)); // 없는 객체의 인덱스 : -1

		// 객체 포함 여부
		System.out.println("100을 포함? " + v.contains(100));

		v.removeElement(100); // 객체 삭제
		System.out.println("v: " + v);

		v.removeElementAt(7); // 인덱스 7의 요소 삭제
		System.out.println("v: " + v);

		v.set(4, 100); // 인덱스 4의 요소 변경
		System.out.println("v: " + v);

		for (int i = 0; i < v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();

		for (Integer item : v) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		// Enumeration 반복자
		// 순서대로 요소를 받아올 때는 반복자가 더 효율적.
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		System.out.println();

		// 버퍼 비우기
		v.clear();
		System.out.println("v: " + v);
	}

}
