package com.javaex.jdbc.oracle.dao.HR;

import java.util.List;

public interface SalaryDAO {
	public List<SalaryVO> searchMinMax(int minSal, int maxSal);
	
}
