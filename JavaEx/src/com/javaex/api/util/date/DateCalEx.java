package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalEx {

	public static void main(String[] args) {
		
//		dateEx();
		calendarEx();
		

	}
	
	private static void dateEx() {
		// 날짜를 얻어옴
		Date now = new Date(); // 현재 날짜의 시간
		System.out.println("현재 : " + now);
		
		// 포매터 : 형식과 출력
		// 종류 : FULL, LONG, MEDIUM, SHORT
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG : " + df.format(now));
		
		// TODO: DateFormat을 MEDIUM, SHORT로 바꿔서 출력해보기.
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM : " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT : " + df.format(now));
		
		
		// SimpleDateFormat (내가 직접 포맷 조작?)
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("SHORT : " + sdf.format(now));
		// TODO: Time Format을 바꿔 가며 출력 확인.
		sdf = new SimpleDateFormat("a HH:mm:ss");
		System.out.println("SHORT : " + sdf.format(now));
	}
	
	private static void calendarEx() {
		// 캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		// 주의 : 워러 정보는 0부터
		custom.set(1999, 11,31); // 1999년 12월 31일
		
		System.out.println("현재 : " + now);
		System.out.println("사용자 정의 : " + custom);
		
		// 캘린더에서 현재 년도, 월, 일;
		// 캘린더 상수 사용
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.%n",year,month,date);
		
		// 100일 후로 이동
		Calendar future = Calendar.getInstance();
		future.add(Calendar.DATE, 100);
		System.out.printf("100일 후 : %d년 %d월 %d일%n"
				, future.get(Calendar.YEAR)
				, future.get(Calendar.MONTH) + 1
				, future.get(Calendar.DATE)
				);
		// 이 날은 무슨 요일?
		int dow = future.get(Calendar.DAY_OF_WEEK); // 요일 정보(일요일 1 ~ 토요일 7)
		System.out.println(dow);
		String dowStr = null;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		}
		System.out.println(dowStr);
		
	}

}
