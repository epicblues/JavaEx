package com.javaex.oop.phone;

public class SmartPhone extends Phone {

	public SmartPhone(String number) {
		super(number);
		power = false;
	}

	@Override
	public void turnOn(boolean on) {
		power = on;
		System.out.println("Is Power On ? " + power);
	}

	@Override
	public void call(String number) {
		if(power) {
		System.out.println("Smartphone으로" +number + "에게 전화를 겁니다.");
		} else {
			System.out.println("전원을 키셔야 합니다.");
		}
	}
	
	public void searchInternet(String url) {
		if(power) {
		System.out.println("주소 : " + url + "검색중입니다.");
		} else {
			System.out.println("전원을 키셔야 합니다.");
		}
	}

}
