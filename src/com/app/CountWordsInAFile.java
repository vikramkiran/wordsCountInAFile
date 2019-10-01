package com.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountWordsInAFile {

	public static void main(String[] args) {

		HashMap<String, Integer> wordcountmap = new HashMap<String, Integer>();

		BufferedReader bReader = null;

		try {
			bReader = new BufferedReader(new FileReader("abcdef.txt"));

			String currentLine = bReader.readLine();

			String[] words = currentLine.toUpperCase().split(" ");

			for (String word : words) {

				if (wordcountmap.containsKey(word)) {

					wordcountmap.put(word, wordcountmap.get(word) + 1);

				}

				else
					wordcountmap.put(word, 1);

				currentLine = bReader.readLine();

			}

			String mostRepeatedWord = null;

			int count = 0;

			Set<Entry<String, Integer>> entries = wordcountmap.entrySet();

			HashMap<String, Integer> treeMap = new HashMap<String, Integer>(wordcountmap);

			Set<Entry<String, Integer>> entries2 = treeMap.entrySet();

			for (Entry<String, Integer> entry : entries2) {

				if (entry.getValue() > 1) {

					mostRepeatedWord = entry.getKey();

					count = entry.getValue();

					System.out.println(mostRepeatedWord);
					System.out.println(count);

				}

			}

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			for (Entry<String, Integer> entry : entries) {

				if (entry.getValue() > count) {

					mostRepeatedWord = entry.getKey();

					count = entry.getValue();

				}

			}

			System.out.println("The most repeated word in input file is : " + mostRepeatedWord);

			System.out.println("Number Of Occurrences : " + count);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
