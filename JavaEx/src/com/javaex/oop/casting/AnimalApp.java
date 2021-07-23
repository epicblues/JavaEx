package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// Upcasting(Promotion)
		Animal dog1 = new Dog("스누피");
		dog1.eat();
		dog1.walk();
//		dog1.bark(); // 못함
		// 참조 타입의 설계도에 있는 것만 할 수 있다.
		
		// 참조 타입이 자기 자신
		Dog dog2 = new Dog("아지");
		dog2.eat();
		dog2.walk();
		dog2.bark(); // 가능
		
		// DownCasting : 명시적으로 변환할 타입을 지정.
		
		((Dog) dog1).bark(); // 참조 하지 않은 상태로 1회성 변환
		Dog dog3 = (Dog)dog1; // 영구 타입 변경.
		dog3.bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
//		pet = new Cat("야옹이");
//		pet.eat();
//		pet.walk();
		
		// 다운 캐스팅시에는 항상
		// 어떤 클래스의 인스턴스인지 확인 반드시!
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
		
	
	}

}
