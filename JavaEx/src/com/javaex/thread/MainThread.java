package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Main Thread
		// A-Z까지 출력
		Thread thread = new DigitThread();
		thread.setName("Digit Thread");
		Thread thread2 = new Thread(new AlphabetThread());
		thread2.setName("Alphabet Thread");
		
		// 스레드의 우선순위 변경
		// 1(Min) ~ 5(Normal) ~ 10(MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
	
//		digitThread.run(); // 멀티 스레드로 작업을 수행하는 것이 아니다.

		
		thread.start();
		thread2.start();

		// MainThread의 흐름에 WorkingThread들의 흐름을 합류.
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of Main Thread");
	}

}
