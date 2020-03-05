package com.thread;

import java.io.Closeable;
import java.io.IOException;

public class TestRes {

	public static void main(String args[]) {
		
		for(int k=0; k<10; k++) {
			int sum =10;
		}
		
		
//		try {
//			Res1 r1 = new Res1();
//			Res r = new Res();
//			System.out.println("T ");
//		} catch (IOException ioe) {
//			System.out.println("IOE ");
//
//		} finally {
//			System.out.println("F ");
//		}
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}

class Res implements Closeable {

	@Override
	public void close() throws IOException {

		throw new IOException();
	}
}

class Res1 implements AutoCloseable {

	@Override
	public void close() throws IOException {

		System.out.println("1 ");

	}
}
