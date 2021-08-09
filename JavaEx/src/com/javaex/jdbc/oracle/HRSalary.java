package com.javaex.jdbc.oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.sql.*;

public class HRSalary {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		br.close();
		int minSal =Integer.parseInt(st1.nextToken());
		int maxSal =Integer.parseInt(st1.nextToken());
		
		System.out.println("=======================================================");
		
		
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		Statement st = null;
		ResultSet rs = null;
		Connection conn = null;

		try {
			
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			st = conn.createStatement();
			String query = String.format(""
					+ "SELECT first_name || ' ' || last_name, salary from employees"
					+ " where salary between %d and %d"
					+ " order by salary", minSal,maxSal);
			
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.printf("%s \t%d%n", rs.getString(1),rs.getInt(2));
			}
			
		} catch (SQLException e) {
			
		} finally {
			try {
			st.close();
			rs.close();
			conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
