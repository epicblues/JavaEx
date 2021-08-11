package com.javaex.network.echoserver;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			// 소켓 생성 : 데이터 통신용
			socket = new Socket();
			// 시작 메시지
			System.out.println("x클라이언트 시작x");
			System.out.println("[연결 요청]");
			
			// 접속 시도
			InetSocketAddress server = new InetSocketAddress("192.168.0.34", 10000);
			
			socket.connect(server);
			System.out.println("[서버에 연결되었습니다.]");
			
			// OutputStream
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
			bw.write("hello im kms");
			bw.flush();
			bw.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			String message = br.readLine();
			System.out.println("서버로 부터 받은 메시지 : " + message);
			
			// 종료
			System.out.println("<클라이언트 종료>");
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
