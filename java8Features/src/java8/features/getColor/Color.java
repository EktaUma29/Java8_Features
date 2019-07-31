package java8.features.getColor;

public class Color {
	String color;
	String dress;
	int numberOfDress;

	public int getNumberOfDress() {
		return numberOfDress;
	}

	public void setNumberOfDress(int numberOfDress) {
		this.numberOfDress = numberOfDress;
	}

	public String getDress() {
		return dress;
	}

	public void setDress(String dress) {
		this.dress = dress;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Color(String dress, String color, int numberOfDress) {
		super();
		this.color = color;
		this.dress = dress;
		this.numberOfDress = numberOfDress;
	}

}
