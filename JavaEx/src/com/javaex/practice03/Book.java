package com.javaex.practice03;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    
    public Book(int bookNo, String title,String author) {
		this.setBookNo(bookNo);
		this.setTitle(title);
		this.setAuthor(author);
		setStateCode(1);
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public void rent() {
		if (stateCode == 0) {
			System.out.println("이미 대여된 책입니다.");
		} else {
			stateCode = 0;
			System.out.println(title + "이(가) 대여 됐습니다.");
		}
	}
	
	public void print() {
		System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무 : %s%n",
    			getBookNo(),getTitle(),getAuthor(),
    			getStateCode() == 1 ? "재고있음" : "대여중");
		 ;
		
	}
    
    
    
    
}
