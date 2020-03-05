package com.yash.abstractfactory;

public class FactoryDesignPatternTest {

	public static void main(String args[]) {
//	Food indianfood = FoodAbstractFactory.getFood("IndianFood", "Poha and Jalebi", "Dal Rice", "Palak Paneer and Roti");
//	
//	Food italianFood = FoodAbstractFactory.getFood("ItalianFood", "Italian Salad with extra Cheese", "Pasta", "Tandori Paneer Pizza");
//	
//	System.out.println(indianfood.getBreakFast());
		
		
		
		Food food = FoodFactory.getFood(new IndianFoodFactory("Poha and Jalebi", "Dal Rice", "Palak Paneer and Roti"));
		
		System.out.println(food);
	
	}

}
