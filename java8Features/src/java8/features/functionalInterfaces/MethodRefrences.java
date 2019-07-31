package java8.features.functionalInterfaces;

@FunctionalInterface
interface FunctionalInt1 {

	void draw(int n);

}

public class MethodRefrences {

	int id;

	static void drawDisplay(int n) {
		System.out.println("Hey!! Static Method is here " + n * n);
	}

	void drawDisplay1(int n) {
		System.out.println("Hey!! Non Static Method is here " + n * n * n);
	}

	public MethodRefrences(int id) {
		super();
		this.id = id;
		System.out.println("Hey!! Constructor is here: " + id / 2);
	}

	public MethodRefrences() {

	}

	public static void main(String[] args) {
		

		FunctionalInt1 staticObject = MethodRefrences::drawDisplay;
		staticObject.draw(6);

		MethodRefrences methodRefrences = new MethodRefrences();
		FunctionalInt1 nonStaticObject = methodRefrences::drawDisplay1;
		nonStaticObject.draw(2);

		FunctionalInt1 constructorObject = MethodRefrences::new;
		constructorObject.draw(10);

	}

}
