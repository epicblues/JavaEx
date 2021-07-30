package com.javaex.io.charstream;

import java.io.*;

public class BufferedCharStream {
	static String rootPath = CharStreamEx.rootPath;
	static String source = rootPath + "last-leaf.txt";
	static String target = rootPath + "last-leaf-filtered.txt";

	public static void main(String[] args) {
		// 주 스트림
		Reader fr = null;
		Writer fw = null;

		// 보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			// 주 스트림
			fr = new FileReader(source);
			fw = new FileWriter(target);
			// 보조 스트림
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			String line = "";

			while ((line = br.readLine()) != null) {
				// 해당 라인에 leaf 혹은 leaves가 포함된 라인만 저장.
				if (line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves")) {
					bw.write(line);
					bw.write("\r\n");
				}
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e) {
			}
		}

	}

}
