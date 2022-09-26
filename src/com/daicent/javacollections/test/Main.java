package com.daicent.javacollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
import java.util.*;

public class Main {
	
	static Map<StudentSb, List<Subject>> maplist = new HashMap<>();
	static Map<Classes, List<StudentSb>> clmap = new HashMap<>();

	public static void main(String[] args) {
		School scl = new School(1, "FPT");
		School scl1 = new School(2, "NEU");
		School scl2 = new School(3, "HUE");
		System.out.println(scl.equals(scl2) && scl.equals(scl1));
		Set<School> schl = new HashSet<School>();
		schl.add(scl2);
		schl.add(scl1);
		schl.add(scl);
		for (School s : schl) {
			System.out.println(s);
		}
		Student std = new Student(1, "Son", 7, 8, new Classzz(1, "Class 1"));
		Student std2 = new Student(2, "Hieu", 6, 7, new Classzz(2, "Class 2"));
		Student std3 = new Student(3, "Thuan", 8, 7, new Classzz(3, "Class 3"));
		Student std4 = new Student(4, "Phuc", 9, 7, new Classzz(4, "Class 4"));
		Student std5 = new Student(5, "Hoa", 5, 6, new Classzz(5, "Class 5"));

//		Classes cl = new Classes(1, "1");
//		Classes c2 = new Classes(2, "2");
//		Classes c3 = new Classes(3, "3");
//		Classes c4 = new Classes(4, "4");
//		Classes c5 = new Classes(5, "5");

		Grade gd = new Grade(1, "Grade 1");
		Grade gd1 = new Grade(2, "Grade 2");
		Grade gd2 = new Grade(3, "Grade 3");
		Grade gd3 = new Grade(4, "Grade 4");
		Grade gd4 = new Grade(5, "Grade 5");

		Classzz clzz1 = new Classzz(1, "Class 1");
		Classzz clzz2 = new Classzz(2, "Class 2");
		Classzz clzz3 = new Classzz(3, "Class 3");
		Classzz clzz4 = new Classzz(4, "Class 4");
		Classzz clzz5 = new Classzz(5, "Class 5");

		List<Student> lists = new ArrayList<Student>();
		lists.add(std);
		lists.add(std2);
		lists.add(std4);
		for (Student st : lists) {
			System.out.println(st.toString());
		}

		ComparatorToAge ageComparator = new ComparatorToAge();
		Collections.sort(lists, ageComparator);
		System.out.println("So sanh theo tuoi:");
		for (Student st : lists) {
			System.out.println(st.toString());
		}
		ComparatorToPointt point = new ComparatorToPointt();
		Collections.sort(lists, point);
		System.out.println("So sanh theo diem: ");
		for (Student stdd : lists) {
			System.out.println(stdd.toString());
		}
		System.out.println("diem cao nhat lớp: ");

		System.out.println(lists.get(0));

		System.out.println("==============");
		Set<Student> setStudent = new HashSet<>();
		setStudent.add(std4);
		setStudent.add(std3);
		setStudent.add(std2);
		setStudent.add(std);
		for (Student s : setStudent) {
			System.out.println(s);
		}
		System.out.println("=====----=====");
		List<Student> students = new ArrayList<Student>();
		students.add(std);
		students.add(std5);
		students.add(std4);
		students.add(std3);
		students.add(std2);

		Map<Classzz, List<Student>> classListMap = new HashMap<>();
		for (Student s : students) {
			Classzz cls = s.getClasszz();
			classListMap.containsKey(cls);
			if (classListMap.containsKey(cls) == true) {
				classListMap.put(cls, students);
				System.out.println(classListMap);

			} else {
				List<Student> list = Arrays.asList(s);
				classListMap.put(cls, list);

			}
		}

		System.out.println("----=====-----");

		List<Student> listAll = Arrays.asList(std, std2);

		System.out.println("Các lớp: " + listAll);

		System.out.println("----------");

		List<ClassStudent> listClStd = new ArrayList<>();
		listClStd.add(null);

		

		System.out.println("====+++++=====");

		List<Student> lisssst = new ArrayList<>();
		lisssst.add(std5);
		lisssst.add(std4);
		lisssst.add(std3);

		Map<Classes, List<Student>> mapppMap = new HashMap<>();
		List<Student> stList = Arrays.asList(std2);
		for (Student student : lisssst) {
			if (mapppMap.containsKey(student)) {
				mapppMap.get(student).add(student);
			} else {
				//mapppMap.put(c3, Arrays.asList(student));
			}
			System.out.println(mapppMap);
		}

		System.out.println("+++++++++++++");
		List<ClassStudent> listStd = new ArrayList<ClassStudent>();
		Map<Classzz, List<ClassStudent>> mapap = new HashMap<Classzz, List<ClassStudent>>();
		for (ClassStudent s : listStd) {
			List<Classzz> listClass = s.getListClaszz();
			// if (!CollectionUtils.isEmpty(listClass)) {
			for (Classzz cls : listClass) {
				if (mapap.containsKey(cls)) {
					mapap.get(cls).add(s);
					System.out.println(mapap);
				} else {
					mapap.put(cls, Arrays.asList(s));
					System.out.println(mapap);
				}
			}
			// }
			// Dem so hoc sinh trong trg
			Map<Grade, List<Classzz>> maaap = new HashMap<Grade, List<Classzz>>();
			Map<Student, List<Classzz>> maap = new HashMap<Student, List<Classzz>>();
			Map<Student, List<Classzz>> mapp = new HashMap<Student, List<Classzz>>();
			Map<Classzz, List<Student>> maapp = new HashMap<Classzz, List<Student>>();
			// Tinh hs trong trg
			Set<Student> setstd = new HashSet<>();
			for (Student student : setstd) {

			}
		}
		StudentSb st1 = new StudentSb(1, "A");
		StudentSb st2 = new StudentSb(2, "B");
		StudentSb st3 = new StudentSb(3, "C");
		Subject sb1 = new Subject(1, "Toan", 9);
		Subject sb2 = new Subject(2, "Toan", 5);
		Subject sb3 = new Subject(3, "Toan", 7);

		List<Subject> s1 = new ArrayList<>();
		s1.add(sb1);
		List<Subject> s2 = new ArrayList<>();
		s2.add(sb2);
		List<Subject> s3 = new ArrayList<>();
		s3.add(sb3);

		maplist.put(st1, s1);
		maplist.put(st2, s2);
		maplist.put(st3, s3);

		StudentSb st4 = new StudentSb(4, "E");
		StudentSb st5 = new StudentSb(5, "F");
		StudentSb st6 = new StudentSb(6, "G");
		Subject sb4 = new Subject(1, "Toan", 9);
		Subject sb5 = new Subject(2, "Toan", 9);
		Subject sb6 = new Subject(3, "Toan", 9);

		List<Subject> s4 = new ArrayList<>();
		s4.add(sb4);
		List<Subject> s5 = new ArrayList<>();
		s5.add(sb5);
		List<Subject> s6 = new ArrayList<>();
		s6.add(sb6);

		maplist.put(st4, s4);
		maplist.put(st5, s5);
		maplist.put(st6, s6);

		Classes cl1 = new Classes(1, "1");
		Classes cl2 = new Classes(1, "2");

		List<StudentSb> stu1 = new ArrayList<>();
		stu1.add(st1);
		List<StudentSb> stu2 = new ArrayList<>();
		stu2.add(st2);
		List<StudentSb> stu3 = new ArrayList<>();
		stu3.add(st3);
		List<StudentSb> stu4 = new ArrayList<>();
		stu4.add(st4);
		List<StudentSb> stu5 = new ArrayList<>();
		stu5.add(st5);
		List<StudentSb> stu6 = new ArrayList<>();
		stu6.add(st6);

		clmap.put(cl1, stu1);
		clmap.get(cl1).add(st2);
		clmap.get(cl1).add(st3);
		clmap.put(cl2, stu4);
		clmap.get(cl2).add(st5);
		clmap.get(cl2).add(st6);

		School a = new School(1, "a");

		Map<School, List<Classes>> school = new HashMap<>();
		List<Classes> c1 = new ArrayList<>();
		c1.add(cl1);
		List<Classes> c2 = new ArrayList<>();
		c2.add(cl2);

		school.put(a, c1);
		school.get(a).add(cl2);
		System.out.println("High score Class: ");

		List<StudentSb> list = new ArrayList<>();
		for (Classes clazz : school.get(a)) {
			System.out.println("class " + clazz.getNameClass());
			List<StudentSb> tmp = getHighScoreClass(clazz);
			printList(tmp);
			list.addAll(tmp);
		}
		System.out.println("High score school: ");
		list = sortStudentByScore(list);
		for (StudentSb student : list) {
			if (getMathScore(student) == getMathScore(list.get(0))) {
				System.out.println(student);
			}
		}
	}

	static void printList(List<StudentSb> list) {
		for (StudentSb student : list) {
			System.out.println(student);
		}
	}

	static double getMathScore(StudentSb a) {
		for (Subject subject : maplist.get(a)) {
			if (subject.getName() == "Toan") {
				return subject.getScore();
			}
		}
		return -1;
	}

	static List<StudentSb> sortStudentByScore(List<StudentSb> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++)
				if (getMathScore(list.get(i)) < getMathScore(list.get(j))) {
					Collections.swap(list, i, j);
				}
		}
		return list;
	}

	static List<StudentSb> getHighScoreClass(Classes a) {
		List<StudentSb> studentList = new ArrayList<>();
		sortStudentByScore(clmap.get(a));
		for (StudentSb student : clmap.get(a)) {
			if (getMathScore(student) == getMathScore(clmap.get(a).get(0))) {
				studentList.add(student);
			}
		}
		return studentList;
	}

}
