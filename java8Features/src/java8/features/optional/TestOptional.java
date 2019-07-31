package java8.features.optional;

import java.util.Optional;
public class TestOptional {
	
	    public Optional<String> findMyPhone(int phoneId) {
	        return phoneId == 10
	                ? Optional.of("MyCheapPhone")
	                : Optional.empty();
	    }

	    public String buyNewExpensivePhone() {
	       // System.out.println("\tGoing to a very far store to buy a new expensive phone");
	        return "NewExpensivePhone";
	    }


	    public static void main(String[] args) {
	        TestOptional test = new TestOptional();
	        String phone;
	       
	        phone = test.findMyPhone(10).orElse(test.buyNewExpensivePhone());
	        System.out.println("\tUsed phone: " + phone + "\n");

	       
	        phone = test.findMyPhone(-1).orElse(test.buyNewExpensivePhone());
	        System.out.println("\tUsed phone: " + phone + "\n");

		
		  // Can be written as test::buyNewExpensivePhone phone =
		  test.findMyPhone(10).orElseGet(() -> test.buyNewExpensivePhone());
		  System.out.println("\tUsed phone: " + phone + "\n");
		  
		  
		  phone = test.findMyPhone(-1).orElseGet(() -> test.buyNewExpensivePhone());
		  System.out.println("\tUsed phone: " + phone + "\n");
		 
	    }
}