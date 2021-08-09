package com.javaex.jdbc.oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HRSearchEmployee {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String search = br.readLine().toLowerCase();
		br.close();
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
			String query = String.format("SELECT first_name || ' ' || last_name full_name, email, phone_number, to_char(hire_date,'YYYY-MM-DD')"
					+ " from employees"
					+ " where lower(first_name) like '%%%s%%' or lower(last_name) like '%%%s%%'", search,search) ;
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.printf("%s\t%s\t%s\t%s\t%n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
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


