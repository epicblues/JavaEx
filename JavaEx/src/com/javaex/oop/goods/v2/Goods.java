package com.javaex.oop.goods.v2;


// v2. 접근 제한자
// 	getter/setter 를 통한 내부 필드의 우회 접근
public class Goods {
	// 필드 선언
	
	private String name;
	private int price;
	
	// getters / setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void showInfo() {
		System.out.println("상품 이름 : " + getName());
		System.out.println("가격 : " + getPrice());
	}
}
