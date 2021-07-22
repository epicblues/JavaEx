package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods notebook = new Goods(); 
		Goods smartphone = new Goods();
		// setter를 통한 우회 접근
		notebook.setName("LG그램");
		notebook.setPrice(1700000);
		
		smartphone.setName("iPhone 12");
		smartphone.setPrice(800000);
		
		// 출력
		
		notebook.showInfo();
		smartphone.showInfo();
		
	}

}
