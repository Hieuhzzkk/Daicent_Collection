package com.daicent.javacollections.test;

import java.util.Objects;

public class Classes {
	private int idClass;
	private String nameClass;
	
	
	public Classes(int idClass, String nameClass) {
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
	public int hashCode() {
		return Objects.hash(idClass, nameClass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classes other = (Classes) obj;
		return idClass == other.idClass && Objects.equals(nameClass, other.nameClass);
	}
	
	@Override
	public String toString() {
		return "Class" +  "idClass=" + idClass + " " + "nameClass=" + nameClass;
	}
	
	
}
