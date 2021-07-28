package com.javaex.api.collection.list;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		// 스택 생성
		// LIFO
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < 5; i++) {
			stack.push(i); // 데이터 입력
			System.out.println("STACK: " + stack);
		}
		
		// 가장 위쪽 데이터 확인 
		System.out.println(stack.peek()); // 데이터를 확인만 하고 지우지는 않는다.
		
		while(!stack.empty()) {
			System.out.println("POP : " + stack.pop()); // 가장 마지막 누락 데이터를 추출
			System.out.println("Stack : " + stack);
			
		}

	}

}
