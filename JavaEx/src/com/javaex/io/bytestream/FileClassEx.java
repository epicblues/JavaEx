package com.javaex.io.bytestream;
import java.io.*;
public class FileClassEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	public static void main(String[] args) {
		// 파일 객체.
		File root= new File(rootPath);
		// 파일이 실제로 존재하는가
		System.out.println(rootPath + ":" + root.exists());
		
		
		printInfo(root);
		
		if(!root.exists()) { // 경로가 존재하지 않으면
			//디렉토리 생성
			root.mkdirs();
		}
			
		// 디렉터리 내부에 파일 생성해 봅니다.
		File newFile = new File(rootPath + "myfile.txt");
		if(!newFile.exists()) {
			try {
			newFile.createNewFile();
			} catch(IOException e) {
				System.err.println("파일을 만들지 못했어요");
			}
		}
		
		printInfo(root);
		
		// 파일을 지운다.
		newFile.delete();
		
		printInfo(root);
		
		//실행 파일인가, 기본 파일인가 확인해보기
		
		
	}
	
	private static void printInfo(File f) {
		System.out.println("-----------------------");
		
		// 전달 받은 파일 객체가 디렉터리인가?
		if (f.isDirectory()) { // 디렉터리
			// 디렉터리 내부의 파일 목록을 받아와서 출력
			System.out.println("Directory : " + f.getName());
			
			// 목록 불러오기
			File[] files = f.listFiles();
			
			// 리스트 출력
			for (File file : files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.printf("%s - %d%n",file.getName(),file.length());
			}
		} else { // 파일이다
			// 파일의 이름 출력
			System.out.println("File: " + f.getName());
			
		}
	}

}
