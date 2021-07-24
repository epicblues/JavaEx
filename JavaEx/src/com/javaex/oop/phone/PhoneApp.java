package com.javaex.oop.phone;

public class PhoneApp {

	public static void main(String[] args) {
		Phone tp = new TelePhone("010-2406-5216");
		tp.turnOn(true);
		tp.turnOn(false);
		tp.call("0102-234234");

		
		Phone tp2 = new SmartPhone("010-4544-5216");
		tp2.turnOn(true);
		tp2.turnOn(false);
		tp2.turnOn(true);
		tp2.call("0102-234234");
		if(tp2 instanceof SmartPhone) {
			((SmartPhone)tp2).searchInternet("http://naver.com");
		}
	}

}
