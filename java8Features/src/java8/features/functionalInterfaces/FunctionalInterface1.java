package java8.features.functionalInterfaces;

import java.util.function.Function;

@FunctionalInterface
interface FunctionalInt{
	
	void draw(int n);
	
}

public class FunctionalInterface1 {
	
	static void drawDisplay(int n) {
		System.out.println("Hey!! Its Working " + n*n);
	}

	public static void main(String[] args) {
		
	Function<Integer, Integer> functionalInt = (n) -> n*n;
	
	System.out.println(functionalInt.apply(10));
	//functionalInt.draw(6);
		
		
		
	}

}
