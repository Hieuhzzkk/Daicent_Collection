package com.daicent.javacollections.arraylist;

import java.util.ArrayList;

public class LearnArrayList {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal());
		animals.add(new Animal());
		animals.add(new Animal());
		animals.add(new Animal());
		
		Animal a = animals.get(0);
		animals.set(1, new Animal());
		
		Animal[] arr = new Animal[5];
		animals.toArray(arr);
		
		System.out.println("size of arraylist: " + animals.size());
		System.out.println("size of array: " + arr.length);
	}
}
