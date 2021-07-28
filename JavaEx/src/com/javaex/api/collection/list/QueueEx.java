package com.javaex.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// Queue : 선입선출(First Input First Out)
		Queue<Integer> q = new LinkedList<Integer>();
		
		// 데이터 제공하기
		for (int i = 0; i<5; i++) {
			q.offer(i); // ENQUEUE
			System.out.println("QUEUE" + q);
		}
		
		// 가장 먼저 입력된 데이터 확인 : 삭제 하지는 않는다.
		System.out.println(q.peek());
		
		
		while(!q.isEmpty()) {
			System.out.println("추출된 데이터 : " + q.poll()); //DEQUEUE
			System.out.println("QUEUE" + q);
		}

	}

}
