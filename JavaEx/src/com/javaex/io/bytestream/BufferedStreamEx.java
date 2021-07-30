package com.javaex.io.bytestream;

import java.io.*;
import java.util.Arrays;

public class BufferedStreamEx {
	static final String rootPath = FileStreamEx.rootPath;
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_buffered_copy.jpg";

	public static void main(String[] args) {
		InputStream fis = null;
		OutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(source); // 메인 스트림
			fos = new FileOutputStream(target);

			bis = new BufferedInputStream(fis); // 보조 스트림
			bos = new BufferedOutputStream(fos);

			byte[] data = new byte[10240];
			int size = 0;
			while ((size = bis.read(data)) != -1) {
				bos.write(Arrays.copyOfRange(data, 0, size));
				System.out.println(size + "바이트 복사");
			}
			bos.flush();
			System.out.println("출력이 완료되었습니다.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				bis.close(); // 연결된 주 스트림도 닫힌다.
				bos.close();
			} catch (Exception e) {
			}
		}

	}

}
