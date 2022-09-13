package com.daicent.javacollections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> setStrings =  new HashSet<String>();
		setStrings.add("A");
		setStrings.add("B");
		setStrings.add("C");
		setStrings.add("A");
		for (String s: setStrings) {
			System.out.println(s);			
		}
	}
	
}
