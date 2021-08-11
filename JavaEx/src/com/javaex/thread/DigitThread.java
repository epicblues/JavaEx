package com.javaex.thread;

import java.util.Scanner;

public class DigitThread extends Thread {
	
	public DigitThread() {
		// TODO Auto-generated constructor stub
	}
	
	public DigitThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		// 스레드의 실행 로직
		// 주의 : 이 메서드는 직접 호출하면 안된다.
		
		for(int i = 1; i<=30; i++) {
			System.out.printf("%s: %d%n", getName(),i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
//		super.run();
	}
}
