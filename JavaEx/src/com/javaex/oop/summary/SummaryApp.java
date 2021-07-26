package com.javaex.oop.summary;

public class SummaryApp {

	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 30);
		Human h2 = new TheOne("네오", 40);
		
		Panda p1 = new Panda("핑",30);
		Panda p2 = new KungfuPanda("포", 15);
		h1.eat(); // animal 클래스의 일반 메서드
		h1.say(); // animal 클래스의 추상 메서드 -> 반드시 자식 클래스에서 override 구현.
		fight(h1);
		fly(h1);
		
		p1.eat();
		p1.say();
		fight(p1);
		fly(p1);
		
		h2.eat();
		h2.say();
		fight(h2);
		fly(h2);
		
		p2.eat();
		p2.say();
		fight(p2);
		fly(p2);
	}
	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			// Flyable로 다운캐스팅 가능
			((Flyable)actor).fly();
			return;
		} // 캐스팅 불가
		System.out.printf("%s : 날지 못해요.%n", actor.name);
	}
	
	
	private static void fight(Animal actor)  {
		// actor가 KungfuSkill 인터페이스를 구현?
		if (actor instanceof KungfuSkill) {
			// KungfuSkill로 다운캐스팅 가능
			((KungfuSkill)actor).kungfu();
			return;
		} // 캐스팅 불가
		System.out.printf("%s : 쿵푸 못해요.%n", actor.name);
		
		
	}

}
