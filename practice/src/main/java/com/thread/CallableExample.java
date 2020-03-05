package com.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
	

	public static void main(String[] args) throws InterruptedException, ExecutionException 
    {
       
		// FutureTask is a concrete class that 
	    // implements both Runnable and Future 
	    FutureTask[] randomNumberTasks = new FutureTask[5]; 
	  
	    for (int i = 0; i < 5; i++) 
	    { 
	      Callable callable = new FactorialCalculator(); 
	  
	      // Create the FutureTask with Callable 
	      randomNumberTasks[i] = new FutureTask(callable); 
	  
	      // As it implements Runnable, create Thread 
	      // with FutureTask 
	      Thread t = new Thread(randomNumberTasks[i]); 
	      t.start(); 
		System.out.println(randomNumberTasks[i].get());
    }
	}
}

	class FactorialCalculator implements Callable<Integer> {

		

		@Override
		public Integer call() throws Exception {
	        Random generator = new Random(); 
	  
	        Integer randomNumber = generator.nextInt(5); 
	  
	        Thread.sleep(randomNumber * 1000); 
	  
	        System.out.println("Runnning.....");
	        
	        return randomNumber;
		}
	}
