package com.javaex.jdbc.oracle;

import java.sql.*;

public class ConnectionTest {

	public static void main(String[] args) {
		// DB 접속 URL (localhost : 1521 : xe)
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "c##bituser";
		String dbpass = "bituser";
		
		// 접속
		Connection conn = null;
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
			System.out.println(conn);
			System.out.println("연결 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패"); // Class.forName 관련 예외.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원 정리
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
