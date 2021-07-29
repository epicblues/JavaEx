package com.javaex.io.charstream;

import java.io.*;

public class CharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String fileName = rootPath + "char.txt";

	public static void main(String[] args) {
//		writeTest();
		readTest();
	}

	private static void writeTest() {
		Writer fwriter = null; // 캐릭터 기반 출력 스트림의 최고 조상.

		try {

			// 출력 스트림 생성
			fwriter = new FileWriter(fileName, // 파일명
					true); // true -> append(추가) 모드

			// 기록
			fwriter.write("Bit Computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2021.07\r\n");
			fwriter.flush(); // 버퍼 비우기

			System.out.println("파일을 기록했습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fwriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void readTest() {
		Reader fReader = null;

		try {
			fReader = new FileReader(fileName);
			int data = 0;

			while ((data = fReader.read()) != -1) {
				System.out.print((char) data);

			}
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
