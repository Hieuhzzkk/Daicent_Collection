package com.daicent.javacollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.size());
		List<String> list2 = new ArrayList<>();
		list2.add("e");
		list2.add("f");
		list.addAll(list2);
		System.out.println(list.get(0));
		list.set(0, "new element");
		System.out.println(list.indexOf("b"));
		list.add("b");
		System.out.println(list.lastIndexOf("b"));
		list.remove(2);
		//list.clear();
		//System.out.println(list.contains("z"));
		System.out.println(list.contains("f"));
		List<String> list3 = list.subList(1, 3);
		list.toArray();
		System.out.println("------------");
		for(String element: list) {
			System.out.println(element + "\t");
		}
		System.out.println("_______________");
		for(String element: list3) {
			System.out.println(element + "\t");
		}
	}
}
