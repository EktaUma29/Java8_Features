package com.yash.factory;

public abstract class Food {

	public abstract String getBreakFast();

	public abstract String getLunch();

	public abstract String getDinner();

	@Override
	public String toString() {
		return "Food [getBreakFast()=" + getBreakFast() + ", getLunch()=" + getLunch() + ", getDinner()=" + getDinner()
				+ "]";
	}

	
}
