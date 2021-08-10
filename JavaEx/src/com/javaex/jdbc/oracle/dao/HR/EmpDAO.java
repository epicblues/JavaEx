package com.javaex.jdbc.oracle.dao.HR;

import java.util.List;

public interface EmpDAO {
	
	public List<EmpVO> searchEmp(String keyword);
}
