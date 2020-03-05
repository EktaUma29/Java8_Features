package com.javacodegeeks.delimiters.tdd;

import java.util.ArrayList;
import java.util.HashMap;

public class CountUniqueWords {
	ArrayList<String> wordsList = new ArrayList<>();

	public ArrayList<String> uniqueWordsList(String words) {
		// TODO Auto-generated method stub

		String[] wordsStringArray = words.split("[\\s@&.?$+-,]+");
		for (String word : wordsStringArray) {
			wordsList.add(word);
		}
		countWords(wordsList);
		return wordsList;
	}

	public static HashMap<String, Integer> countWords(ArrayList<String> wordsList) {

		HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
		for (String words : wordsList) {
			if (wordsMap.containsKey(words)) {

				wordsMap.put(words, wordsMap.entrySet().iterator().next().getValue() + 1);
			} else {
				wordsMap.put(words, 1);
			}
		}
		return wordsMap;
	}

}
