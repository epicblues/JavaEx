package com.javaex.jdbc.oracle.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DAOApp {

	public static void main(String[] args) {

	
		searchAuthor();
		
	}

	private static void searchAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색키워드 : ");
		String keyword = sc.nextLine();
		sc.close();
		AuthorDAO dao = new AuthorDAOImplOracle();
		
		List<AuthorVO> list = dao.search(keyword);
		
		if(list.size() == 0) {
			System.out.println("해당하는 열이 없습니다.");
			return;
		}

		Iterator<AuthorVO> iter = list.iterator();

		while (iter.hasNext()) {
			AuthorVO row = iter.next();
			System.out.printf("%d\t%s\t%s%n", row.getAuthorId(), row.getAuthorName(), row.getAuthorDesc());
		}

		System.out.println("------------------------------");
	}
	
	private static void getAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저자번호 : ");
		Long id = Long.parseLong(sc.nextLine());
		sc.close();
		AuthorDAO dao = new AuthorDAOImplOracle();
		AuthorVO vo =  dao.get(id);
		if (vo == null) {
			System.out.println("결과가 없습니다.");
		} else {
			System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
		}
		System.out.println("------------------------------");
	}
	
	private static void updateAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저자번호 : ");
		Long id = Long.parseLong(sc.nextLine());
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("경력 : ");
		String desc = sc.nextLine();

		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.update(new AuthorVO(id, name, desc));
		System.out.println("Author UPDATE : " + (success ? "성공" : "실패"));
		sc.close();
	}

	private static void deleteAuthor() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제 id : ");
		Long id = Long.parseLong(sc.nextLine());
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.delete(id);
		System.out.println("Author DELETE : " + (success ? "성공" : "실패"));
		sc.close();
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

		System.out.println("Author INSERT : " + (success ? "성공" : "실패"));
		scanner.close();
	}

	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOImplOracle();
		List<AuthorVO> list = dao.getList();

		Iterator<AuthorVO> iter = list.iterator();

		while (iter.hasNext()) {
			AuthorVO row = iter.next();
			System.out.printf("%d\t%s\t%s%n", row.getAuthorId(), row.getAuthorName(), row.getAuthorDesc());
		}

		System.out.println("------------------------------");

	}
}
