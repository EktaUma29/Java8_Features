package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
	 public static void main(String[] args) {  
	        ExecutorService executor = Executors.newFixedThreadPool(3);//creating a pool of 5 threads  
	        for (int i = 0; i < 5; i++) {  
	            Runnable worker = new WorkerThread("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	    }  

}
class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  