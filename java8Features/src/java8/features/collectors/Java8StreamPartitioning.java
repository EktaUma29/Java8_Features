package java8.features.collectors;

import java8.features.collectors.Person.Gender;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8StreamPartitioning {

	public static void main(String[] args) {
	 
	        List <Person> persons = new ArrayList <Person> ();
	        persons.add(new Person(1, "Yashwant", Gender.MALE));
	        persons.add(new Person(2, "Mahesh", Gender.MALE));
	        persons.add(new Person(3, "Divya", Gender.FEMALE));
	 
	        Predicate <Person> predicate = p -> p.getGender() == Gender.MALE;
	 
	        Map <Boolean, List<Person>> partionedByMale = persons.stream().collect(Collectors.partitioningBy(predicate));
	 
	        System.out.println(partionedByMale);
	        
	       
	 
	    }
}
