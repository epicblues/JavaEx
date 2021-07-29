package com.javaex.api.collection.hash;

public class Student {
	public String name;
	public int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		
		return id; // 학번을 hashCode로 활용한다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return  name.equals(((Student)obj).name);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
}
