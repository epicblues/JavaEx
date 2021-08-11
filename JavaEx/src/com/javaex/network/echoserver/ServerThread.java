package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	// 소켓
	private Socket socket;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// 접속 성공시: 클라이언트 정보 확인
		try {
		InetSocketAddress remote = (InetSocketAddress) socket.getRemoteSocketAddress();
		System.out.println("[클라이언트가 접속되었습니다]");
		System.out.println(remote.getAddress() + " : " + remote.getPort());

		// 클라이언트로 부터 메시지 수신
		// Stream 열기
		InputStream is = socket.getInputStream();
		// 주고 받을 데이터 Text -> Reader
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

		// 클라이언트로 Echo Back을 하기 위한 스트림 열기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));

		// 데이터 읽기
		while (true) {
			String message = br.readLine();
			if (message == null) {
				System.out.println("접속 종료");
				break;
			}
			System.out.println("클라이언트로 부터의 메시지 " + message);
			System.out.println("Echo Back " + message);
			// 클라이언트로 Echo Back
			bw.write("[Echo] : " + message);
			bw.newLine(); // 전송
			bw.flush();// 버퍼 비우기
		}

		// 스트림 닫기
		bw.close();
		br.close();
		
		// 스레드 로직 끝
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
