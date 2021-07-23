package com.javaex.oop.song.v2;

public class Song {
	
	private String title;
	private String artist;
	private String album,composer;
	private int year;
	private int track;
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public Song( String title,String artist,String album,String composer,int year,int track) {
		this(title,artist);
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %d번 track, %s 작곡)%n",artist,title,album,year,track,composer);
	}
}
