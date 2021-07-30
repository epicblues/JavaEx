package com.javaex.io.bytestream;

import java.io.*;

public class FileStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";

	public static void main(String[] args) {

		FileInputStream is = null;
		FileOutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			int data = 0;

			while ((data = is.read()) != -1) {
				os.write(data);
			}

			System.out.println("파일을 복사했습니다!");
			

		} catch (FileNotFoundException e) {
			System.err.println("찾을 수 없습니다");
		}

		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
