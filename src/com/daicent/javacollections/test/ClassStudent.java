package com.daicent.javacollections.test;

import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

public class ClassStudent {
	private Integer idStudent;
	private String name;
	private List<Classzz> listClaszz;
	public ClassStudent(Integer idStudent, String name, List<Classzz> listClaszz) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.listClaszz = listClaszz;
	}
	public Integer getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Classzz> getListClaszz() {
		return listClaszz;
	}
	public void setListClaszz(List<Classzz> listClaszz) {
		this.listClaszz = listClaszz;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idStudent, listClaszz, name);
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
		return Objects.equals(idStudent, other.idStudent) && Objects.equals(listClaszz, other.listClaszz)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "ClassStudent [idStudent=" + idStudent + ", name=" + name + ", listClaszz=" + listClaszz + "]";
	}
	
	
}
