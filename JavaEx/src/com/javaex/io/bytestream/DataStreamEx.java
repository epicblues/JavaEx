package com.javaex.io.bytestream;

import java.io.*;

public class DataStreamEx {
	static String rootPath = BufferedStreamEx.rootPath;
	static String filename = rootPath + "primitives.txt";

	// DataStream 기본 데이터 타입 저장
	public static void main(String[] args) {
		InputStream fis = null;
		OutputStream fos = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream(filename); // 주 스트림
			dos = new DataOutputStream(fos);
			fis = new FileInputStream(filename);
			dis = new DataInputStream(fis);

			// 출력 : String -> Boolean -> int -> float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);

			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(38);
			dos.writeFloat(99.9f);
			// 주의 : 출력한 순서대로 들어온다.
			for(int i = 0; i<2 ; i++) System.out.printf("%s : %s : %d : %.1f%n", dis.readUTF(), dis.readBoolean(), dis.readInt(), dis.readFloat());
			
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
