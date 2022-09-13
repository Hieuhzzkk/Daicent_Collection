package com.daicent.javacollections.test;

public class Class {
	private int idClass;
	private String nameClass;
	
	
	public Class(int idClass, String nameClass) {
		super();
		this.idClass = idClass;
		this.nameClass = nameClass;
	}
	public int getIdClass() {
		return idClass;
	}
	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	@Override
	public String toString() {
		return "Class" +  "idClass=" + idClass + " " + "nameClass=" + nameClass;
	}
	
	
}
