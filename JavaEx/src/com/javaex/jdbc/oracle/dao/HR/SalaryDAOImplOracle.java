package com.javaex.jdbc.oracle.dao.HR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalaryDAOImplOracle implements SalaryDAO {

	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl, "hr", "hr");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return conn;
	}

	@Override
	public List<SalaryVO> searchMinMax(int minSal, int maxSal) {
		List<SalaryVO> list = new ArrayList<SalaryVO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			String query = "SELECT first_name || ' ' || last_name, salary FROM employees "
					+ "WHERE salary > ? and salary < ? ORDER BY salary";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, minSal);
			pstmt.setInt(2, maxSal);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new SalaryVO(rs.getString(1), rs.getInt(2)));
			}
		} catch (SQLException e) {
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
