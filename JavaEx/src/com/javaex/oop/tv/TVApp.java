package com.javaex.oop.tv;



public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		
		
		tv.power(true);
		tv.volume(120);
		try {
			Thread.sleep(1000); 
		} catch (Exception e) {}
		tv.status();
		
		tv.volume(false);
		tv.channel(1);
		try {
			Thread.sleep(1000); 
		} catch (Exception e) {}
		tv.status();
		
		tv.channel(false);
		try {
			Thread.sleep(1000); 
		} catch (Exception e) {}
		tv.status();
	}

}
