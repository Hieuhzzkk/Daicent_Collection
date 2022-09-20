package com.daicent.javacollections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sweepstakes_HashSet {
	Set<String> box = new HashSet<String>();
	
	public Sweepstakes_HashSet() {
	}
	public boolean addCode(String value) {
		 return this.box.add(value);
	}
	public boolean deleteCode(String value) {
		 return this.box.remove(value);
	}
	public boolean checkCode(String value) {
		 return this.box.contains(value);
	}
	public void clearCode() {	
		  this.box.clear();
	}
	public int amount() {
		return this.box.size();
	}
	public void printCode() {
		System.out.println(Arrays.toString(this.box.toArray()));
	}
	public static void main(String[] arg) {
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		Sweepstakes_HashSet sh =  new Sweepstakes_HashSet();
		do {
			System.out.println("--------------------------------");
			System.out.println("1. Add code");
			System.out.println("2. Delete code");
			System.out.println("3. Check code whether or not");
			System.out.println("4. Clear code");
			System.out.println("5. Print code");
			choose = sc.nextInt();
			sc.nextLine();
			if (choose==1 || choose==2 || choose==3) {
				System.out.println("Insert code");
				String value = sc.nextLine();
				if (choose==1) {
					sh.addCode(value);
				}
				else if(choose==2) {
					sh.deleteCode(value);
				}
				else {
					System.out.println("Result check: " + sh.checkCode(value));
				}
			}
			
			else if(choose==4){
				sh.clearCode();
			}
			else if(choose==5){
				System.out.println("Full code");
				sh.printCode();
			}
		} while (choose != 0);
	}
}
