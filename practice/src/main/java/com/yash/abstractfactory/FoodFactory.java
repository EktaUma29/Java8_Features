package com.yash.abstractfactory;

public class FoodFactory {

	public static Food getFood(FoodAbstractFactory factory) {

		return factory.createFood();
	}

}
