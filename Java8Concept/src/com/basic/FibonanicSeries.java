package com.basic;

import java.util.LinkedList;

class FibonanicSeries {

	public static void main(String[] args) {

		ListNode node1 = new ListNode();
		ListNode node2 = new ListNode();
		ListNode node3 = new ListNode();
		ListNode node4 = new ListNode();
		ListNode node5 = new ListNode();
		ListNode node6 = new ListNode();

		node1.setName("ID_A01");
		node2.setName("ID_A02");
		node3.setName("ID_A03");
		node4.setName("ID_A04");
		node5.setName("ID_A05");
		node6.setName("ID_A06");

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(null);

		ListNode node = node1;

		ListNode nodeR = rotate(node1, 2);

		for (int k = 0; k <= 5; k++) {
			System.out.print(nodeR.getName() + " -> ");
			nodeR = nodeR.getNext();
		}

	}

	public static ListNode rotate(ListNode head, int k) {

		int count = 0;
		
		ListNode start = head;
		
		while (head.getNext() != null) {
			head = head.getNext();
			count++;
		}
		
		count++;
		
		k = k % count;
		k = Math.abs(count - k);
		
		if (k == 0)
			return start;
		head.setNext(start);
		
		while (k-- > 0) {
			head = head.getNext();
		}
		
		start = head.getNext();
		head.setNext(null);
		return start;
	}
}

class ListNode {

	private String Name;
	private ListNode next;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}
