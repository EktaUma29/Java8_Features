package com.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class CountWordOccuranceInFile {

	public static void main(String[] args) throws IOException {

		// String str = "hello welcome in this hello world let me check how many
		// people is there";
		// BufferedWriter bw = new BufferedWriter(new FileWriter("word.txt"));
		// bw.write(str);
		// bw.close();

		System.out.println("Writing done!!!!");

		HashMap<String, Integer> map = new HashMap();

		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
		String str = br.readLine();

		String st;
		while ((st = br.readLine()) != null) {
			for (String s : st.split(" ")) {

				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.putIfAbsent(s, 1);
				}

			}
		}

		System.out.println(map);
	}

}
