package com.spring.demo.one;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String data[] = { "get ready for Fortune two", "get ready for Fortune one",
			"get ready for Fortune Three", };

	Random random = new Random();

	public String getFortune() {

		int index = random.nextInt(data.length);

		return data[index];
	}

}
