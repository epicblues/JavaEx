package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

	public static void main(String[] args) {
		
		//서버 소켓
		ServerSocket serverSocket = null;
		try {
			// binding 작업 : 주소와 포트 연결
			serverSocket = new ServerSocket();
			InetSocketAddress ip = new InetSocketAddress("192.168.0.34", 10000); 
			serverSocket.bind(ip); // ip로 들어온 것 허용.
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다]");
			
			
			// 클라이언트 연결 대기
			while(true) {
				Socket socket = serverSocket.accept(); // 연결 대기.
				Thread thread = new ServerThread(socket);
				// 쓰레드 시작
				thread.start();
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}


	}

}
