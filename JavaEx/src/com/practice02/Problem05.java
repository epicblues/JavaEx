package com.practice02;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		int scoreboard[][] = {
				{80,75,90,95,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78}
		};
		int sum = 0;
		int count = 0;
		
		
		for(int i = 0; i< scoreboard.length;i++) {
			for(int j=0;j<scoreboard[i].length;j++) {
				sum += scoreboard[i][j];
				count++;
			}
		}
		
		float average = (float)sum / count;
		System.out.printf("합계 : %d%n평균 : %.1f", sum,average);
	}

}
