package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods notebook = new Goods("LG그램",1700000);
		Goods smartphone = new Goods("iPhone 12",1200000);
	
		
		
		smartphone.setName("iPhone 12");
//		smartphone.setPrice(800000); Price의 Readonly화
		
		// 출력
		
		notebook.showInfo();
		smartphone.showInfo();
		
	}

}
