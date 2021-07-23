package com.javaex.oop.phone;

public class PhoneApp {

	public static void main(String[] args) {
		Phone tp = new TelePhone("010-2406-5216");
		tp.turnOn(true);
		tp.turnOn(false);
		tp.call("0102-234234");

	}

}
