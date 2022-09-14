package com.daicent.javacollections.io.readingfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ReadingFiles {
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream("src/text.txt");
			fileOutputStream = new FileOutputStream("src/text_cp.txt");
			
			int ch;
			while ((ch = fileInputStream.read()) != -1) {
				System.out.print((char)ch);
				fileOutputStream.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		System.out.println("\n");
		int numLines = 0;
		int numWord = 0;
		int numChars = 0;
		Scanner myFile = null;
		try {
			Scanner file =  new Scanner(new File("src/text.txt"));
			myFile = file;
		} catch (Exception e) {
			System.out.println("You file does not exist");
		}
		
		while (myFile.hasNextLine()) {
			String curLine = myFile.nextLine();
			int size = curLine.length();
			boolean foundDiv = true;//No word on this line
			boolean foundChar = false;//No characters yet
			//Check the current line for words
			for (int i = 0; i < size; i++) {
				if (curLine.charAt(i) == ' ') {
					foundDiv =  true;
					foundChar = false;
				}
				else {
					foundChar =  true;
					numChars++;
				}
				if (foundChar && foundDiv) {
					numWord++;
					foundDiv = false;
				}
			}
			numLines++;
		}
		myFile.close();
		System.out.println("Number of Words: " + numWord);
		System.out.println("Number of Lines: " + numLines);
		System.out.println("Number of Characters: " + numChars);

	}
}
