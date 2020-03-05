package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteDemo {
//	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	static ArrayList l = new ArrayList();

	public void run() {
		// Child thread trying to
		// add new element in the
		// Collection object
		l.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("c");

		// We create a child thread
		// that is going to modify
		// ArrayList l.
		CopyOnWriteDemo t = new CopyOnWriteDemo();
		t.run();

//		Thread.sleep(1000);

		// Now we iterate through
		// the ArrayList and get
		// exception.
		
		l.add("A");
		l.add("B");
		l.add("c");
		
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
//			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}
