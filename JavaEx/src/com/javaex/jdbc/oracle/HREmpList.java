package com.javaex.jdbc.oracle;

import java.sql.*;

public class HREmpList {
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			st = conn.createStatement();
			rs = st.executeQuery("SELECT e.first_name || ' ' || e.last_name name, "
					+ "m.first_name || ' ' ||m.last_name mgr_name" + " from employees e, employees m "
					+ "where e.manager_id = m.employee_id " + "ORDER BY e.first_name desc");

			while (rs.next()) {
				String name = rs.getString("name");
				String mgrName = rs.getString("mgr_name");
				System.out.printf("Name : %s  Manager : %s%n", name, mgrName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("드라이버 로드 실패");
		} finally {
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
