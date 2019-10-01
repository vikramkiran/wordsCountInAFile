package com.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile2 {

	public static void main(String[] args) {

		try {

			/*
			 * FileWriter fileWriter = new FileWriter("abcde.txt");
			 * fileWriter.write("hi hru uuu hhihhhhhhhhh  hhhhhhhhhhhhh");
			 * fileWriter.close();
			 */
			File file = new File("abcde.txt");

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {

				String string = scanner.nextLine();
				System.out.println(string);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
