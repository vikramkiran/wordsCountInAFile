package com.app;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {

		System.out.println(args);
		try {
			File myObj = new File("filename.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		CreateFile c = new CreateFile();
		c.display();
	}

	public static void main(Integer[] args) {

		System.out.println("hii");
	}

	void display() {

	}

}
