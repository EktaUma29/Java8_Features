package com.data.structure;

class Node {
	int data;
	Node next;
	static int size = 0;

	public Node(int data) {
		this.data = data;
		size++;
	}

}

public class LinkedListCustom {

	static int size;

	public static void main(String[] args) {

		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		Node node5 = new Node(50);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		System.out.println("Size: " + Node.size);

		LinkedListCustom.diplayList(node1);
		int medianNode = LinkedListCustom.findMedianNode(node1);
		System.out.println("Median Node: " + medianNode);
		
		int nodeIndex = LinkedListCustom.findNodeAtLast(node1, 3);
		System.out.println("Node: " + nodeIndex);

	}

	private static int findNodeAtLast(Node node, int n) {

		Node ref, main;
		ref = main = node;
		
		for(int i=0; i<n; i++)
			ref = ref.next;
		while(ref.next!=null) {
			main = main.next;
			ref = ref.next;
		}
		
		return ref.data;
	}

	private static int findMedianNode(Node node) {
		Node head = node;
		Node  slow, fast;
		slow = fast = head;
		
		while(fast.next!= null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			head = head.next;
		}

		return slow.data;
	}

	private static void diplayList(Node node) {

		for (int i = 0; i < Node.size; i++) {
			System.out.println(node.data);
			node = node.next;
		}

	}

}
