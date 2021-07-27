package com.javaex.api.arrays;


// 선후 비교를 위해 Comparable 인터페이스를 구현해 줘야 한다.
public class Member implements Comparable{
	String name;

	public Member(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		// 리턴 값이 0: 두 객체의 순서는 같다.
		//		음수 : 순서가 앞이다.
		//		양수 : 순서가 뒤다.
		
		if (o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		
		
		return 0;
	}
	
}
