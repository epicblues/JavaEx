package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {

//		basicHashSet();	
		CustomHashSet();
	}

	private static void basicHashSet() {
		// 생성

		HashSet<String> hs = new HashSet<>();

		// 객체의 추가

		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java"); // 해시 코드가 같다고 간주하기 떄문에 중복으로 간주 -> 중복 삽입 허용 안함.
		System.out.println("hs : " + hs);
		System.out.println("hs 의 사이즈 : " + hs.size());

		// 지정 객체 포함 여부 : contains()

		System.out.println("Java를 포함하고 있는가? " + hs.contains("Java"));
		System.out.println("Linux를 포함하고 있는가? " + hs.contains("Linux"));

		// 객체 삭제 : remove();
		hs.remove("C++");
		System.out.println("hs : " + hs);
		System.out.println("hs 의 사이즈 : " + hs.size());

		hs.clear(); // 셋 비우기
		System.out.println("hs : " + hs);
		System.out.println("hs 의 사이즈 : " + hs.size());
	}

	private static void CustomHashSet() {
		// 사용자 정의 클래스에서의 hash
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("홍길동", 10));
		hs.add(new Student("홍길동", 20));
		hs.add(new Student("홍길동", 10));

		System.out.println(hs);
		System.out.println(hs.contains(new Student("홍길동",10)));
		
	}
}
