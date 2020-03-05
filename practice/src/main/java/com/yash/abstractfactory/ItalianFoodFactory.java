package com.yash.abstractfactory;

public class ItalianFoodFactory implements FoodAbstractFactory {

	private String breakFast;
	private String lunch;
	private String dinner;

	public ItalianFoodFactory(String breakFast, String lunch, String dinner) {
		super();
		this.breakFast = breakFast;
		this.lunch = lunch;
		this.dinner = dinner;
	}
	
	@Override
	public Food createFood() {
		return new ItalianFood(breakFast, lunch, dinner);
	}

}
