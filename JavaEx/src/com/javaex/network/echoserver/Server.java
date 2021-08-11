package com.javaex.network.echoserver;

import java.net.*;
public class Server {

	public static void main(String[] args) {
		
		//서버 소켓
		ServerSocket serverSocket = null;
		try {
			// binding 작업 : 주소와 포트 연결
			serverSocket = new ServerSocket();
			InetSocketAddress ip = new InetSocketAddress("127.0.0.1", 10000); // 외부의 모든 IP의 10000번 포트
			serverSocket.bind(ip); // ip로 들어온 것 허용.
			
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다]");
			
			Socket socket = serverSocket.accept(); // 연결 대기.
			
			// 접속 성공시: 클라이언트 정보 확인
			InetSocketAddress remote = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 접속되었습니다]");
			System.out.println(remote.getAddress() + " : " + remote.getPort());
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
