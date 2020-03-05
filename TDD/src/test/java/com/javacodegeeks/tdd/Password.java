package com.javacodegeeks.tdd;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import com.javacodegeeks.delimiters.tdd.CountUniqueWords;

public class Password {

	CountUniqueWords countUnique = new CountUniqueWords();

	@Test
	public void shouldCountUniqueWords() {
		HashMap<String, Integer> expectedMap = new HashMap<>();
		expectedMap.put("Boom", 2);
		expectedMap.put("Bang", 1);
		ArrayList<String> wordsStringArray = countUnique.uniqueWordsList("Boom, + Bang, + Boom");
		HashMap<String, Integer> orginalMap = CountUniqueWords.countWords(wordsStringArray);
		Assert.assertEquals(expectedMap, orginalMap);
	}

}
