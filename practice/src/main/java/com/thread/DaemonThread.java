package com.thread;

public class DaemonThread extends Thread{
	public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread1(), "dt");
        dt.setDaemon(true);
        dt.start();
        //continue program
//        Thread.sleep(30000);
        System.out.println("Finishing program");
    }

}
class DaemonThread1 implements Runnable{

    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }

    private void processSomething() {
    	System.out.println("Processing daemon thread");
       
    }
    
}