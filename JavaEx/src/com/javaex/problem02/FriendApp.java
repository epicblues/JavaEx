package com.javaex.problem02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        
        
        
        for(int i = 0; i < friendArray.length; i++) {
        	// 친구정보 입력받기
        	StringTokenizer st = new StringTokenizer( sc.nextLine());
        	// 입력받은 친구정보를 공백으로 분리
        	String name = st.nextToken();
        	String hp = st.nextToken();
        	String school = st.nextToken();
            // Friend 객체 생성하여 데이터 넣기
        	friendArray[i] = new Friend(name,hp,school);
            // 배열에 추가하기
        }
     
        

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            System.out.printf("이름 : %s 핸드폰 : %s 학교 : %s%n", 
            		friendArray[i].getName(),friendArray[i].getHp(),friendArray[i].getSchool());
        }

        sc.close();
    }

}
