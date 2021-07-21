package com.practice02;



public class Problem04 {

	public static void main(String[] args) {
		
		int count = 0;
		int[] lotto = new int[6];
		int randNum;
		
		while(count <6) {
			boolean isUnique = true;
			randNum = (int)(Math.random()*45) + 1;
			for(int i=0; i<count; i++) {
				if(lotto[i] == randNum) {
					isUnique = false;
					break;
				}
			} // 중복 체크
			if(isUnique) {
				lotto[count] = randNum;
				System.out.print(lotto[count] + "\t");
				count++;
			}
			
				
			
		}
		
		

	}

}
