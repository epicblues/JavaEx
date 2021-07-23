package com.practice02;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c[] = {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i = 0 ; i < c.length; i++) {
			System.out.print(c[i]);
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}
		
		System.out.println();
		for(char ch : c) {
			System.out.print(ch);
		}
		
		scan.close();

	}

}
