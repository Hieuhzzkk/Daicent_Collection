package com.daicent.javacollections.set;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private String CMND;
	private String name;
	
	public Student(String cMND, String name) {
		super();
		CMND = cMND;
		this.name = name;
	}
	
	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj.getClass() != this.getClass()) {
			return false;
		}
		Student std = (Student) obj;
		return this.CMND == std.CMND;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	public static void main(String[] args) {
		Set<Student> setStd = new HashSet<Student>();
		Student std = new Student("13213", "adsd");
		
	}
}
