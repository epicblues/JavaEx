package com.javaex.oop.phone;

public abstract class Phone {
	
	public Phone(String number) {
		this.number = number;
		power = false;
	}
	
	protected String number;
	protected boolean power;
	
	
	public abstract void turnOn(boolean on);
	public abstract void call(String number);
}
