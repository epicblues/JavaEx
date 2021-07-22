package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods notebook = new Goods();
		// 필드에 접근
		notebook.name = "LG그램";
		notebook.price = 1700000;
		
		System.out.printf("이름 : %s 가격 : %d원%n",notebook.name,notebook.price);
		
		Goods smartphone = new Goods();
		smartphone.name = "iPhone 12";
		smartphone.price = 800000;
		System.out.printf("이름 : %s 가격 : %d원%n",smartphone.name,smartphone.price);
	}

}
