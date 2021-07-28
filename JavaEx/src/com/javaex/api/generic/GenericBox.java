package com.javaex.api.generic;

// Generic 이용
// T -> Type

public class GenericBox<T> {
	public T content;

	public void setContent(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
}
