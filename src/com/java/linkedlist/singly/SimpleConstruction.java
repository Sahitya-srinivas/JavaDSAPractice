package com.java.linkedlist.singly;

public class SimpleConstruction {

	Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void PrintLList() {
		while(head!=null) {
			System.out.print(head.data+"  ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleConstruction scon = new SimpleConstruction();
		scon.head = new Node(30);
		Node second = new Node(35);
		Node third = new Node(40);
		scon.head.next = second;
		second.next = third;
		scon.PrintLList();
	}
}
