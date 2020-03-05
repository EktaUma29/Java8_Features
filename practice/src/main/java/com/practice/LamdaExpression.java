package com.practice;

public class LamdaExpression {

	public static void main(String[] args) {

		ConcatString us = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
		String sillyString = doSomthing(us, "Check", " Demo");
		// System.out.println(sillyString);

		/*AnotherClass anotherClass = new AnotherClass();
		System.out.println(anotherClass.doSomething());*/
		
		LamdaExpression laExpression = new LamdaExpression();
		laExpression.printValue();
	}

	public static String doSomthing(ConcatString us, String s1, String s2) {
		return us.concatStringMethod(s1, s2);
	}
	
	public void printValue(){
		int number = 20;
		Runnable r = () -> {
			
			try{
				Thread.sleep(5000);
			}
			catch(InterruptedException exception){
				exception.printStackTrace();
			}
			System.out.println("Number= "+ number);
		};
		r.run();
		System.out.println("Outside: "+ number);
	}

}
