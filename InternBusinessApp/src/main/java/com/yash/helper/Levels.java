package com.yash.helper;

public enum Levels {
	BEGINNER(0), INTERMEDIATE(1), ADVANCED(2);
	private int level;

	private Levels(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
}
