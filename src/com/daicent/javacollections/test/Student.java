package com.daicent.javacollections.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparator<Student>{
	private int idStudent;
	private String name;
	private int age;
	private int point;
	
	
	
	public Student(int idStudent, String name, int age, int point) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.point = point;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Map<Student, List<Student>> map = new HashMap<>();
	Map<Class, List<Student>> map2 = new HashMap<>();
	@Override
	public String toString() {
		return "Student" + "idStudent=" + idStudent + " " + "name=" + name + " " + "age=" + age + " " + "point=" + point +  "\n";
	}
	@Override
	public int compare(Student o1, Student o2) {
		return this.getName().compareTo(o1.getName());
	}
	
	
	
}
