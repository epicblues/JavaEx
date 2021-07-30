package com.javaex.io.charstream;

import java.io.*;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String path = BufferedCharStream.rootPath;
	static final String filename = path + "thieves.txt";

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(filename);
			br = new BufferedReader(fr);

			String line = "";

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				while (st.hasMoreTokens()) {
					System.out.print(st.nextToken() + "\t");
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
