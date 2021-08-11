package com.javaex.thread;

// Runnable Interface 구현
public class AlphabetThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.printf("%s: %c%n", Thread.currentThread().getName(),ch);
			
			// 0.3초 대기
			try {
			Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
