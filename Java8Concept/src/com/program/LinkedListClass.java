package com.program;

public class LinkedListClass {
	

	public static void main(String[] args) {

		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();

		n1.setName("n1");
		n2.setName("n2");
		n3.setName("n3");
		n4.setName("n4");
		
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(null);
		
		int size = size(n1); 
		
		System.out.println("Size of List: " +size);
		
		traverse(n1, size);
		
		deleteNode(n1, 3);
		
		
	}

	private static void deleteNode(Node n1, int i) {
		
//		for(int i=0; i<size; i++) {
			
		}
		
//	}

	private static void traverse(Node n1, int size) {

		for(int i=0; i<size; i++) {
			System.out.print(n1.getName() + " ");
			n1 = n1.getNext();
		}
		
	}
	

	private static int size(Node n1) {

		int count =0;
		while(n1.getNext() != null) {
			n1 = n1.getNext();
			count++;
		}
		
		return count+1;
	}

}

class Node {
	
	private String name;
	private Node next;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}