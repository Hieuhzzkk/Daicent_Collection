package com.daicent.javacollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		School scl = new School(1, "FPT");
		School scl1 = new School(2, "NEU");
		School scl2 = new School(3, "HUE");
		System.out.println(scl.equals(scl2)&& scl.equals(scl1));
		Set<School> schl = new HashSet<School>();
		schl.add(scl2);
		schl.add(scl1);
		schl.add(scl);
		for (School s: schl) {
			System.out.println(s);
		}
		Student std = new Student(1, "Son", 7, 8);
		Student std1 = new Student(2, "Hieu", 6, 7);
		Student std2 = new Student(3, "Phuc", 8, 6);
		Student std3 = new Student(4, "Trang", 9, 9);
		Student std4 = new Student(5, "Hoa", 8, 8);
		
		Student std5 = new Student(1, "Son", 7, 4);
		Student std6 = new Student(2, "Hieu", 6, 7);
		Student std7 = new Student(3, "Phuc", 8, 8);
		Student std8 = new Student(4, "Trang", 9, 3);
		Student std9 = new Student(5, "Hoa", 8, 1);
		
		Student std10 = new Student(1, "Son", 7, 5);
		Student std11 = new Student(2, "Hieu", 6, 7);
		Student std12 = new Student(3, "Phuc", 8, 9);
		Student std13 = new Student(4, "Trang", 9, 10);
		Student std14 = new Student(5, "Hoa", 8, 8);
		
		Class cl = new Class(1, "1");
		Class c2 = new Class(2, "2");
		Class c3 = new Class(3, "3");
		Class c4 = new Class(4, "4");
		Class c5 = new Class(5, "5");

		
		Grade gd = new Grade(1, "Grade 1");
		Grade gd1 = new Grade(2, "Grade 2");
		Grade gd2 = new Grade(3, "Grade 3");
		Grade gd3 = new Grade(4, "Grade 4");
		Grade gd4 = new Grade(5, "Grade 5");

		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(5,new Student(1, "Son", 7, 8));
		map.put(3,new Student(2, "Hieu", 6, 7));
		map.put(4,new Student(3, "Phuc", 8, 6));
		map.put(1,new Student(4, "Trang", 9, 9));
		map.put(2,new Student(5, "Hoa", 8, 8));

		//Sắp xếp theo Key
		
		
		

		  List<Student> lists = new ArrayList<Student>();
	        lists.add(std);
	        lists.add(std1);
	        lists.add(std2);
	        lists.add(std4);
	        //Collections.sort((List<Student>) lists);
	        for(Student st : lists){
	            System.out.println(st.toString());
	        }

	        ComparatorToAge ageComparator = new ComparatorToAge();
	        Collections.sort(lists,ageComparator);
	        System.out.println("So sanh theo tuoi:");
	        for(Student st : lists){
	            System.out.println(st.toString());
	        }
	        ComparatorToPointt point = new ComparatorToPointt();
	        Collections.sort(lists, point);
	        System.out.println("So sanh theo diem: ");
	        for(Student stdd : lists){
	            System.out.println(stdd.toString());
	        }
	        System.out.println("diem cao nhat lớp: ");
	        
	            System.out.println(lists.get(0));
	        
	        System.out.println("==============");
//	        Set<Student> setStudent = new HashSet<>();
//	        setStudent.add(std4);
//	        setStudent.add(std3);
//	        setStudent.add(std2);
//	        setStudent.add(std1);
//	        setStudent.add(std);
//	        for (Student s: setStudent) {
//				System.out.println(s);			
//			}

			  List<Student> list2 = new ArrayList<Student>();
		        lists.add(std5);
		        lists.add(std6);
		        lists.add(std7);
		        lists.add(std8);
		        lists.add(std9);


				  List<Student> list3 = new ArrayList<Student>();
			        lists.add(std10);
			        lists.add(std11);
			        lists.add(std12);
			        lists.add(std14);
			        lists.add(std13);
			        
			    List<Student> listAll = new ArrayList<>();
			    listAll.add((Student) lists);
			    listAll.add((Student) list2);
			    listAll.add((Student) list3);
			    System.out.println("Các lớp: " + listAll);
			    
			    
	        System.out.println("----------");
			
			List<ClassStudent> listClStd = new ArrayList<>();
			listClStd.add(null);
			
			Map<Class, Student> mapClassStudent = new HashMap<Class, Student>(); 
			mapClassStudent.put(c5, std4);
			mapClassStudent.put(c4, std3);
			mapClassStudent.put(c3, std2);
			mapClassStudent.put(c2, std);
			
			System.out.println(mapClassStudent);
			
			    

	}
	
	}
	

