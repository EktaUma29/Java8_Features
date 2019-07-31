package java8.stream;

import java.util.ArrayList;
import java.util.Optional;

public class FilterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> list = new ArrayList<Employee>();
		Employee em1 = new Employee(101, "Priyaaa", 10000);
		Employee em2 = new Employee(105, "Roshni", 700000);
		Employee em3 = new Employee(103, "Chhaya", 500000);
		Employee em4 = new Employee(104, "Varsha", 450000);
		Employee em5 = new Employee(10, "Kavita", 110000);
		list.add(em1);
		list.add(em2);
		list.add(em3);
		list.add(em4);
		list.add(em5);

		list.stream().filter(f1 -> (f1.getName().length() > 5)).forEach(System.out::println);

		System.out.println();

		Optional<Employee> sName = list.stream().findFirst().filter(f2 -> f2.getName().length() > 5);
		System.out.print(sName);

		System.out.println();
		System.out.println();
		
		Optional<Employee> vStartName = list.stream().filter(f3 -> f3.getName().equals("Varsha")).findAny();
		System.out.println(vStartName);
		if(vStartName.isPresent()) {
			System.out.println();
		}
	}

}
