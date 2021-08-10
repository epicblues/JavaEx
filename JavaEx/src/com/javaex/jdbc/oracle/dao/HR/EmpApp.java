package com.javaex.jdbc.oracle.dao.HR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class EmpApp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 검색 : ");
		EmpDAO dao = new EmpDAOImplOracle();
		List<EmpVO> list =dao.searchEmp(br.readLine());
		br.close();
		
		Iterator<EmpVO> iter = list.iterator();
		
		while(iter.hasNext()) {
			EmpVO vo = iter.next();
			System.out.printf("%s\t%s\t%s\t%s\t%n", vo.getFullName(),vo.getEmail(),vo.getPhone(),vo.getHireDate());
		}
		
		

	}

}
