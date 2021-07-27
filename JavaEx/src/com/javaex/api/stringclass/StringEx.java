package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
//		stringBasicEx();
//		stringMethodsEx();
		stringBufferEx();

	}

	private static void stringBufferEx() {
		// String 객체는 불변자료(immutable)
		// StringBuffer 객체는 버퍼 기반의 가변 자료형.
		StringBuffer sb = new StringBuffer("This"); // 기본 버퍼(10) 생성
		sb.append(" is pencil"); // append는 맨 뒤에 추가
		sb.insert(8, "my " ); // insert는 중간에 삽입
		sb.replace(8, 10, "new"); // replace는 치환
		System.out.println(sb);  // toString() 호출해서 최종적인 문자열 생성
		sb.setLength(10); // 버퍼 크기를 강제 변경
		System.out.println(sb);
		
		String s = new StringBuffer("This")
				.append(" is pencil")
				.insert(8, "my ")
				.replace(8, 10, "new")
				.toString();
		
		System.out.println("메서드 체이닝 : " + s);
				
		
		
		
	}

	private static void stringMethodsEx() {
		// 유용한 메서드들
		String str = "Java Programming, JavaScript Programming";

		// 변환 메서드
		System.out.println(str.toUpperCase()); // 모두 대문자로
		System.out.println(str.toLowerCase()); // 모두 소문자로

		// String은 불변객체다(내부 내용이 변경되지 않는다.)
		System.out.println("원본 : " + str);

		// 인덱스 관련
		System.out.println("LENGTH : " + str.length());
		System.out.println("char @ 5 : " + str.charAt(5)); // 인덱스 접근.

		// 검색 관련
		System.out.println("str contains Java? " + str.contains("Java"));
		int idx = str.indexOf("Java"); // 처음부터 "Java"를 검색한다.
		System.out.println("1st index of Java : " + idx);
		idx = str.indexOf("Java", 2);
		System.out.println("2st index of Java : " + idx);
		idx = str.indexOf("Java", idx + 4);
		System.out.println("3rd index of Java : " + (idx == -1 ? "없음" : idx));
		// 더 이상 검색이 없으면 -1을 반환한다.

		idx = str.lastIndexOf("Java"); // 역방향 검색
		System.out.println("역방향 검색 : " + idx);

		// 문자열 추출
		System.out.println("substring 5~ : " + str.substring(5));
		System.out.println("substring 5~16 : " + str.substring(5, 16));
		// index 5부터 16(바로 앞 까지)

		// 치환
		System.out.println(str.replace("Java", "C")); // Java -> C

		// 화이트 스페이스 제거
		String s2 = "                  Hello             ";
		String s3 = ", Java";

		System.out.println(s2.trim() + s3); // trim() -> 앞 뒤 공백문자 제거

		// 구분자로 분절

		String[] split = str.split(" ");
		for (String word : split) {
			System.out.println("WORD : " + word);
		}

		System.out.println();

		String[] newStr = str.toUpperCase().replace(",", "").split(" "); // 메서드 체이닝
		for (String word : newStr) {
			System.out.println("WORD : " + word);
		}

		// 문자열 비교(중요) : Unicode의 비교
		System.out.println("ABC".compareTo("ABE"));
		// == 0 : 순서가 같다.
		// < 0 : 순서가 앞이다.
		// > 0 : 순서가 뒤다.
	}

	private static void stringBasicEx() {
		String s1 = "Java"; // 리터럴
		String s2 = new String("Java"); // 메모리에 새 객체 생성
		String s3 = "Java"; // 리터럴

		// 리터럴 문자열은 값이 같으면 같은 객체다.
		System.out.println("s1 == s3 ? " + (s1 == s3)); // 같은 String Pool
		System.out.println("s1 == s2 ? " + (s1 == s2));

		// 문자열 내부에 char의 연속된 데이터다.
		String s4 = new String(new char[] { 'J', 'a', 'v', 'a' });
		System.out.println("s4 ? " + s4);

		// 기본 데이터 타입을 문자열로 변환하고자 할 경우.
		String s5 = String.valueOf(Math.PI);
		System.out.println("s5 ? " + s5);

	}

}
