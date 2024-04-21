package com.java.linkedlist.singly;

public class InsertionLList {

	Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void PrintLList() {
		Node tnode = head;
		while(tnode != null) {
			System.out.print(tnode.data+" ");
			tnode = tnode.next;			
		}
	}
	
	public void pushLast(int d) {
		Node new_node = new Node(d);
		new_node.next = head;
		head = new_node;
	}
	
	public void append(int d) {
		Node new_node = new Node(d);
		if(head == null) {
			head = new Node(d);
			return;
		}
		new_node.next = null;

		Node last = head;
		while(last.next != null) { 
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	
	public void insertAfter(Node prev_node, int d) {
		
		Node new_node = new Node(d);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionLList il = new InsertionLList();
		il.pushLast(12);
		il.pushLast(10);
		il.append(14);
		il.pushLast(8);
		il.insertAfter(il.head.next,9);
		il.pushLast(6);
		il.append(19);
		System.out.println("list is:");
		il.PrintLList();

	}
}
