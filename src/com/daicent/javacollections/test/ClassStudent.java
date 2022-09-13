package com.daicent.javacollections.test;

import java.util.Objects;
import java.util.TreeMap;

public class ClassStudent implements Comparable<ClassStudent>{
	private Student student;
	private TreeMap<Class, Student> mapClassStudent = new TreeMap<>(); 
	
	

	public ClassStudent(Student student, TreeMap<Class, Student> mapClassStudent) {
		super();
		this.student = student;
		this.mapClassStudent = mapClassStudent;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public TreeMap<Class, Student> getMapClassStudent() {
		return mapClassStudent;
	}

	public void setMapClassStudent(TreeMap<Class, Student> mapClassStudent) {
		this.mapClassStudent = mapClassStudent;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mapClassStudent, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassStudent other = (ClassStudent) obj;
		return Objects.equals(mapClassStudent, other.mapClassStudent) && Objects.equals(student, other.student);
	}
	@Override
	public int compareTo(ClassStudent o) {
		
		return 0;
	}
	
}
