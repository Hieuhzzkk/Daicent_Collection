package com.daicent.javacollections.map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {
	private Map<String, String> data = new TreeMap<String, String>();
	public String addWord(String keyWord, String mean) {
		return this.data.put(keyWord, mean);
	}
	public String deleteWord(String keyWord) {
		return this.data.remove(keyWord);
	}
	public String wordLookup(String keyWord) {
		String means = this.data.get(keyWord);
		return means;
	}
	public void printKeyWord() {
		Set<String> keyWordSet = this.data.keySet();
		System.out.println(Arrays.toString(keyWordSet.toArray()));
	}
	public int takeTheQuantity() {
		return this.data.size();
	}
	public void clear() {
		this.data.clear();
	}
	public static void main(String[] args) {
		MyMap dictionary = new MyMap();
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------");
			System.out.println("Menu");
			System.out.println("Dictionary Lookup\n"
							+	"1. Add word(Key word, Means)\n"
							+	"2. Delete word\n"
							+	"3. Lookup word\n"
							+	"4. Print word\n"
							+	"5. Print quantity word\n"
							+	"6. Clear"
					);
			choose = sc.nextInt();sc.nextLine();
			if (choose==1) {
				System.out.println("Insert word: ");
				String keyWord = sc.nextLine();
				System.out.println("Insert means: ");
				String means = sc.nextLine();
				dictionary.addWord(keyWord, means);
			}
			else if (choose==2 || choose==3) {
				System.out.println("Insert word: ");
				String keyWord = sc.nextLine();
				if (choose==2) {
					dictionary.deleteWord(keyWord);
				}else {
					System.out.println("Means: " + dictionary.wordLookup(keyWord));
				}
			}
			else if (choose==4) {
				dictionary.printKeyWord();
			}
			else if (choose==5) {
				System.out.println("Quantity Key Word: " + dictionary.takeTheQuantity());
			}else if (choose==6) {
				dictionary.clear();
			}
		} while (choose!=0);
	}
	
}
