package com.javaex.jdbc.oracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class AuthorDAOImplOracle implements AuthorDAO {
	
	// 접속 코드(커넥션 확보)
	private Connection getConnection() throws SQLException{ // 예외 처리 위임, 호출한 메서드에서처리하라!
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl,"c##bituser","bituser");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} 
		return conn;
		
	}
	
	
	@Override
	public List<AuthorVO> getList() {
		List<AuthorVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT author_id,author_name,author_desc FROM AUTHOR "
					+ "ORDER BY author_id");
			
			while (rs.next()) {
				Long id = rs.getLong(1);
				String name = rs.getString(2);
				String desc = rs.getString(3);
				
				list.add(new AuthorVO(id,name,desc));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return list;
	}

	@Override
	public List<AuthorVO> search(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthorVO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		try {
			conn = getConnection();
			String sql = "INSERT INTO author VALUES"
					+ "(my_seq.nextval, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getAuthorName());
			pstmt.setString(2, vo.getAuthorDesc());
			insertedCount =	pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return 1 == insertedCount;
	}

	@Override
	public boolean update(AuthorVO vo) {
		
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
