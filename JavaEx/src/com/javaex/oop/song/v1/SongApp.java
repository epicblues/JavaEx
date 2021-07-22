package com.javaex.oop.song.v1;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song();
		s1.setTitle("좋은날");
		s1.setArtist("아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.showInfo();

	}

}
