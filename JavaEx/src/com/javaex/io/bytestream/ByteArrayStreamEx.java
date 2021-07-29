package com.javaex.io.bytestream;

import java.io.*;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// 입력 소스
		byte[] source = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 출력 목적지
		byte[] target = null;
		
		System.out.println("입력: " + Arrays.toString(source));

		InputStream bis = null;
		OutputStream bos = null;
		try {
			bis = new ByteArrayInputStream(source);
			bos = new ByteArrayOutputStream();

			int data = 0;

			while ((data = bis.read()) != -1) {
				System.out.println("Read data: " + data);
				// 출력 스트림으로 전송
				bos.write(data);
			}
			bos.flush();
			target = ((ByteArrayOutputStream) bos).toByteArray();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("출력 : " + Arrays.toString(target));
	}

}
