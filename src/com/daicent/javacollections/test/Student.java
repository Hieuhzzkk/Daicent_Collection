package com.daicent.javacollections.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student implements Comparator<Student>{
	private int idStudent;
	private String name;
	private int age;
	private int point;
	private Classzz classzz;
	
	
	
	
	public Student(int idStudent, String name, int age, int point, Classzz classzz) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.age = age;
		this.point = point;
		this.classzz = classzz;
	}
	
	
	public int getIdStudent() {
		return idStudent;
	}


	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
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


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public Classzz getClasszz() {
		return classzz;
	}


	public void setClasszz(Classzz classzz) {
		this.classzz = classzz;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, classzz, idStudent, name, point);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(classzz, other.classzz) && idStudent == other.idStudent
				&& Objects.equals(name, other.name) && point == other.point;
	}


	@Override
	public String toString() {
		return "Student" + "idStudent=" + idStudent + " " + "name=" + name + " " + "age=" + age + " " + "point=" + point + "classzz" + classzz + "\n";
	}
	@Override
	public int compare(Student o1, Student o2) {
		return this.getName().compareTo(o1.getName());
	}
	
	
	
}
