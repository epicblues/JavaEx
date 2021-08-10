package com.javaex.jdbc.oracle.dao.HR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOImplOracle implements EmpDAO {

	private Connection getConnection() throws SQLException {
		Connection conn = null;
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl,"hr","hr");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		return conn;
	}
	
	
	@Override
	public List<EmpVO> searchEmp(String keyword) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String query = "SELECT first_name || ' ' || last_name name, email, replace(phone_number,'.','-'),"
					+ " to_char(hire_date,'YYYY\"년\" MM\"월\" DD\"일\"') "
					+ "FROM employees WHERE LOWER(first_name) LIKE ? OR LOWER(last_name) LIKE ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new EmpVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
					
			
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
		
		return list;
	}

}
