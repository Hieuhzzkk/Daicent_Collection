package com.daicent.javacollections.test;

import java.util.Objects;

public class Subject {
	private int idSubject;
	private String name;
	private double score;
	public Subject(int idSubject, String name, double score) {
		super();
		this.idSubject = idSubject;
		this.name = name;
		this.score = score;
	}
	public int getIdSubject() {
		return idSubject;
	}
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	
	
	
}
