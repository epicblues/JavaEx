package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx(); // 인스턴스 생성
		System.out.println("참조 카운트: " + StaticEx.refCount); 
		// static 멤버는 new로 인스턴스를 생성하지 않아도 접근할 수 있다.
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트: " + s2.refCount);
		
		// 객체가 제거
		
		s1 = null; // 참조를 해제한다.하지만 바로 즉각 코드를 읽고 해지하는 것이 아니다.
		System.out.println("s1이 해제");
		System.out.println("참조 카운트: " + StaticEx.refCount);
		System.gc(); // 가비지 콜렉터 수행
		
		try {
			
			// 잠시 대기
			Thread.sleep(3000); // 단위 millisecond; 가비지 컬렉트를 언제 수행될 지 모른다.
			
			System.out.println("참조 카운트: " + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}
	
		

}
