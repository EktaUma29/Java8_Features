package com.yash.abstractfactory;

public class ItalianFood extends Food {

	private String breakFast;
	private String lunch;
	private String dinner;
	
	
	
	public ItalianFood(String breakFast, String lunch, String dinner) {
		super();
		this.breakFast = breakFast;
		this.lunch = lunch;
		this.dinner = dinner;
	}
	

	@Override
	public String getBreakFast() {
		return this.breakFast;
	}

	@Override
	public String getLunch() {
		return this.lunch;
	}

	@Override
	public String getDinner() {
		return this.dinner;
	}

}
