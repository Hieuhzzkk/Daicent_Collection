package com.daicent.javacollections.io.readingfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;
	
public class ReadFile2GB {
	public static void main(String [] args) throws IOException {
		try {

            File f = new File("src/text.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));
        
            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
		int numLines = 0;
		int numWord = 0;
		int numChars = 0;
		// Read in the file
		Scanner myFile = null;
		try {
			Scanner file = new Scanner(new File("src/text.txt"));
			myFile = file;
		} catch (Exception e) {
			System.out.println("You file does not exist");
		}

		while (myFile.hasNextLine()) {

			String curLine = myFile.nextLine();
			int size = curLine.length();
			boolean foundDiv = true;// No word on this line
			boolean foundChar = false;// No characters yet
			// Check the current line for words
			for (int i = 0; i < size; i++) {
				if (curLine.charAt(i) == ' ') {
					foundDiv = true;// Division
					foundChar = false;// Since last division on chars
				} else {
					// Found char
					foundChar = true;
					numChars++;
				}
				if (foundChar && foundDiv) {
					numWord++;
					foundDiv = false;// No division since last char
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
