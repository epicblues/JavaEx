package com.javaex.thread.synchronize;

public class MainThread {

	public static void main(String[] args) {
		// 공유 객체 설정
		SharedMemory sh = new SharedMemory();
		// 스레드 생성(스레드 생성자에 string parameter가 들어가면 스레드 이름이 설정된다)
		Thread user1 = new User("철수",sh,100);
		Thread user2 = new User("영희",sh,50);
		
		user1.start();
		user2.start();
		
	}

}
