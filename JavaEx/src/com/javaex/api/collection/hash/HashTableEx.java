package com.javaex.api.collection.hash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// Hashtable 생성
		Hashtable<String,ClassRoom> map = new Hashtable<>();
		
		// 맵에 데이터 넣기 : put
		map.put("101", new ClassRoom("Java","R101"));
		map.put("201", new ClassRoom("C","R201"));
		map.put("301", new ClassRoom("Python","R301"));
		map.put("201", new ClassRoom("Linux","R201"));
		
		System.out.println(map);
		
		// 데이터 가져오기: 키를 이용해서 접근할 수 있다.
		System.out.println("301: "+ map.get("301"));
		
		//	키가 있는지 확인하기.
		System.out.println("301이 있는가: " + map.containsKey("301"));
		System.out.println("501이 있는가: " + map.containsKey("501"));
		
		// 값이 있는지 확인하기.
		System.out.println(map.containsValue(new ClassRoom("Java","R101")));
		System.out.println(map.containsValue(new ClassRoom("Java")));
		
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		// Enumeration
		Enumeration<ClassRoom> en = map.elements();
		while(en.hasMoreElements()) {
			ClassRoom room = en.nextElement();
			System.out.println(room);
		}
		
		Enumeration<String> en2 = map.keys();
		while(en2.hasMoreElements()) {
			String room = en2.nextElement();
			System.out.println(room);
		}
		
		
		// 맵 비우기
		map.clear();
		System.out.println(map);
	}

}
