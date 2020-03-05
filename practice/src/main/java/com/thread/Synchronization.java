package com.thread;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Synchronization {

		
		public static void main(String args[]) 
	    { 
	        Sender snd = new Sender(); 
	        ThreadedSend S1 = 
	            new ThreadedSend( " Hi " , snd ); 
	        ThreadedSend S2 = 
	            new ThreadedSend( " Bye " , snd ); 
	  
	        S1.start(); 
	        S2.start(); 
	  

	    } 
	}


class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		
		System.out.println("\n" + msg + "Sent");
	}
	
	public void send1(String msg) 
    { 
        System.out.println("Sending\t: send1" + msg ); 
         
    } 
}

class ThreadedSend extends Thread {
	private String msg;
	Sender sender;

	ThreadedSend(String m, Sender obj) {
		msg = m;
		sender = obj;
	}

	ThreadedSend(String m) {
		msg = m;
	}
	
	public void run() {
		
		System.out.println("starting");
//		for()
		synchronized (sender) {
			sender.send(msg);
		}
//		sender.send1(msg);
		
		System.out.println("interupptionnnnnn");
	}
}