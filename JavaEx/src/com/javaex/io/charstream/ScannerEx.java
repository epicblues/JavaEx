package com.javaex.io.charstream;

import java.io.*;
import java.util.*;

public class ScannerEx {
	static String filename = StringTokenizerEx.filename;

	public static void main(String[] args) {

		File file = null;
		Scanner sc = null;

		try {
			file = new File(filename);
			sc = new Scanner(file);
			String name = "";
			float height = 0;
			float weight = 0;

			while (sc.hasNextLine()) {
				name = sc.next();
				height = sc.nextFloat();
				weight = sc.nextFloat();
				System.out.printf("%s\t%.1f\t%.1f\t%n", name, height, weight);
				sc.nextLine();
			}
			
			

		} catch (IOException e) {
		} finally {
			sc.close();
		}

	}

}
