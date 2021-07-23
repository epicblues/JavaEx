package com.javaex.oop.song.v2;



public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song("좋은날","아이유","Real","이민수",2010,3);
		s1.showInfo();
		Song s2 = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007,2);
		s2.showInfo();
		Song s3 = new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",2012,4);
		
		s3.showInfo();

	}

}
