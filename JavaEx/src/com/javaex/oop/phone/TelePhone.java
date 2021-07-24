package com.javaex.oop.phone;

public class TelePhone extends Phone {

	public TelePhone(String number) {
		super(number);
		
	}

	@Override
	public void turnOn(boolean on) {
		power = on;
		System.out.println("Is Power On ? " + power);
	}

	@Override
	public void call(String number) {
		if(power) {
		System.out.println("Telephone으로 " +number + "에게 전화를 겁니다.");
		} else {
			System.out.println("전원을 키셔야 합니다.");
		}
	}

}
