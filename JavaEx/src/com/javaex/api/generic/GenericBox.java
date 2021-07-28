package com.javaex.api.generic;

// Generic 이용
// T -> Type

// 파라미터 갯수는 제한이 없다.

public class GenericBox<T> {
	public T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
}
