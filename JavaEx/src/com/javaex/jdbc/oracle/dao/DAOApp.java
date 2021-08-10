package com.javaex.jdbc.oracle.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {
		listAuthors();
		insertAuthor();
		listAuthors();
		
	}
	
	private static void insertAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		System.out.print("경력 : ");
		String desc = scanner.nextLine();
		
		AuthorVO vo = new AuthorVO(name, desc);
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		
		boolean success = dao.insert(vo);
		
		System.out.println("Author INSERT : " + (success? "성공" : "실패"));
		scanner.close();
	}
	
	private static void listAuthors() {
		AuthorDAOImplOracle dao = new AuthorDAOImplOracle();
		List<AuthorVO> list = dao.getList();
		
		Iterator<AuthorVO> iter = list.iterator();
		
		while (iter.hasNext()) {
			AuthorVO row = iter.next();
			System.out.printf("%d\t%s\t%s%n", 
					row.getAuthorId()
					,row.getAuthorName()
					,row.getAuthorDesc());
		}
		
		System.out.println("------------------------------");
		
	}
}
