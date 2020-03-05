package com.yash.factory;

public class FoodFactory {
	
	public static Food getFood(String type, String breakFast, String lunch, String dinner ) {
		
		if("IndianFood".equalsIgnoreCase(type))
			return new IndianFood(breakFast, lunch, dinner);
		else if("ItalianFood".equalsIgnoreCase(type))
			return new ItalianFood(breakFast, lunch, dinner);
		
		return null;
	}

}
