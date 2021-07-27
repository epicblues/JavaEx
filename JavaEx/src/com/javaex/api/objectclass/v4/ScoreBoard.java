package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class ScoreBoard implements Cloneable{
	
	// 참조 타입 필드
	private int[] scores;
	
	public ScoreBoard(int ... scores) {
		this.setScores(scores);
	}

	// getter/setter
	
	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "ScoreBoard [scores=" + Arrays.toString(scores) + "]";
	}
	
	public ScoreBoard getClone() {
		ScoreBoard clone = null;
		
		try {
			clone = (ScoreBoard)clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return clone;
		
	}
	
	
	// 깊은 복제의 경우 내부 참조 필드를 
	// 새로 복제해야 새 객체로 만들고
	// 참조 다시 연결해야
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// 먼저 얕은 복제를 시도
		ScoreBoard clone = (ScoreBoard)super.clone();
		
		// 내부 참조 객체를 복제.
		clone.setScores(Arrays.copyOf(scores, scores.length));
		
		return clone;

	}
	
	
	
	
	
}
