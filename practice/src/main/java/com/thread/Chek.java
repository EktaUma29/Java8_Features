package com.thread;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Chek{

	
	public static void writer() {
		System.out.println(" Writing. Code.");
	}

	public static void main(String[] args) {
		
		Queue<String> q = new ArrayDeque<>();
		q.add("pen");
		q.add("pencil");
		q.add("box");

		for(String s1 : q) {
			if(s1.indexOf("p") == 0) {
				continue;
			}else {
				System.out.println(s1 + " ");
			}
	}

	

}


}