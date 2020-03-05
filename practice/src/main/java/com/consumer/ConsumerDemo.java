package com.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer = n -> System.out.println(n*n);
		consumer.accept(7);
	}

}
