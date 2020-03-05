package com.yash.factory;

public class FactoryDesignPatternTest {

	public static void main(String args[]) {
	Food indianfood = FoodFactory.getFood("IndianFood", "Poha and Jalebi", "Dal Rice", "Palak Paneer and Roti");
	
	Food italianFood = FoodFactory.getFood("ItalianFood", "Italian Salad with extra Cheese", "Pasta", "Tandori Paneer Pizza");
	
	System.out.println(indianfood.getBreakFast());
	
	}

}
