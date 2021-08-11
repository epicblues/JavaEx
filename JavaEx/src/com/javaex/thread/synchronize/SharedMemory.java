package com.javaex.thread.synchronize;

// 여러 스레드가 공유할 객체
public class SharedMemory {
	// 필드
	private int memory;

	// Getter & Setter
	public int getMemory() {
		return memory;
	}
	
	// 임계 영역 : 멀티 스레드 프로그램 에서 단 하나의 쓰레드만 접근할 수 있는 코드 영역
	// 임계 영역 설정 : 메서드 선언부에 synchronized를 붙인다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// synchronized 하지 않을 경우 다양한 스레드가 해당 객체에 접근했을 때 메모리 데이터를 반환하기 전에 set한 메모리가 변화된다.
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
