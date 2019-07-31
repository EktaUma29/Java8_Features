package java8.features.getColor;

import java.util.ArrayList;

public class RedColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = new Color("Jeans", "RED", 100);
		Color color1 = new Color("Shirts", "RED", 80);
		Color color2 = new Color("Shirts", "BLACK", 45);
		Color color3 = new Color("Kurtis", "YELLOW", 20);
		Color color4 = new Color("Tops", "BLACK", 55);
		Color color5 = new Color("Kurtis", "RED", 50);
		Color color6 = new Color("Tops", "RED", 70);
		ArrayList<Color> colorList = new ArrayList<Color>();
		colorList.add(color);
		colorList.add(color1);
		colorList.add(color2);
		colorList.add(color3);
		colorList.add(color4);
		colorList.add(color5);
		colorList.add(color6);

		/*
		 * long count = colorList.stream().filter(w -> w.getColor() == "RED").count();
		 * System.out.println(count);
		 */

		int sum = colorList.stream().filter(s -> s.getColor() == "RED").mapToInt(s -> s.getNumberOfDress()).sum();

		System.out.println(sum);
	}

}
