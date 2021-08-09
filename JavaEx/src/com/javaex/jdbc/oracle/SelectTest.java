package com.javaex.jdbc.oracle;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		Statement st = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			// 드라이버 로드
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);

			st = conn.createStatement();
			rs = st.executeQuery("SELECT department_id, department_name from departments");
			System.out.println(rs);
			while (rs.next()) {
				System.out.printf("%d:%s%n", rs.getInt(1), rs.getString("DEPARTMENT_NAME"));
			}
		} 
//			catch (ClassNotFoundException e) {
//			System.err.println("드라이버 로드 실패"); // Class.forName 관련 예외.}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 자원 정리
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
