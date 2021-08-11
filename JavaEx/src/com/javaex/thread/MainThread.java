package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Main Thread
		// A-Z까지 출력
		Thread thread = new DigitThread();
		thread.setName("Digit Thread");

		thread.start();
//		digitThread.run(); // 멀티 스레드로 작업을 수행하는 것이 아니다.

		Thread thread2 = new Thread(new AlphabetThread());
		thread2.setName("Alphabet Thread");

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
