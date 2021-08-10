package com.javaex.jdbc.oracle.dao.HR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;



public class SalaryApp {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("최소 연봉과 최대 연봉을 입력하세요");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int minSal = Integer.parseInt(st.nextToken());
		int maxSal = Integer.parseInt(st.nextToken());
		br.close();
		System.out.println("====================================================");
		if(minSal > maxSal) {
			int temp = minSal;
			minSal = maxSal;
			maxSal = temp;
		}
		
		List<SalaryVO> list = new SalaryDAOImplOracle().searchMinMax(minSal, maxSal);
		if(list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		Iterator<SalaryVO> iter = list.iterator();
		
		while(iter.hasNext()) {
			SalaryVO vo = iter.next();
			System.out.printf("%s\t\t%d%n",vo.getFullName(),vo.getSalary());
		}
		
		

	}

}
