package com.clone;

import java.util.ArrayList;
import java.util.List;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department d = new Department(11, "Department");
		List list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		Employee original = new Employee(101, "Employee Name", d, list);
		
		 //Lets create a clone of original object
        Employee cloned = (Employee) original.clone();
 
//        //Let verify using employee id, if cloning actually workded
//        System.out.println(cloned.getId());
// 
//        //Verify JDK's rules
// 
//        //Must be true and objects must have different memory addresses
//        System.out.println(original != cloned);
// 
//        //As we are returning same class; so it should be true
//        System.out.println(original.getClass() == cloned.getClass());
// 
//        //Default equals method checks for references so it should be false. If we want to make it true,
//        //then we need to override equals method in Employee class.
//        System.out.println(original.equals(cloned));
//        
//        
//    cloned.setId(500);
//    List list1 = new ArrayList<String>();
//	list.add("C");
//	list.add("D");
        
//       
	cloned.getDepartment().setId(500);
	cloned.getAddress().add("P");
//    cloned.setAddress(list1);
    System.out.println(original);
    System.out.println(cloned);
        
	}

}
