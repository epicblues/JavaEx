package com.javaex.jdbc.oracle;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class HRSearchEmployeePsd {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		System.out.print("검색어를 입력하세요. :");
		String keyword = br.readLine();
		br.close();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,"hr","hr");
			
			String sql = "SELECT first_name || ' ' || last_name as name, "
					+ "email, phone_number, hire_date "
					+ "FROM employees "
					+ "WHERE lower(first_name) like ? OR "
					+ "lower(last_name) like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+keyword.toLowerCase()+"%");
			pstmt.setString(2, "%"+keyword.toLowerCase()+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s\t%s\t%s\t%s\t%n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
