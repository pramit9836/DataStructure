/**
 * 
 */
package com.learning.doubleneded.linekedlist.operations;

/**
 * @author Pramit
 *
 */
public class LinkedListOperations {

	/**
	 * @param args
	 */
	
	Node head;
	Node tail;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListOperations linkedListOperations = new LinkedListOperations();
		
		linkedListOperations.pushNodeAtFirst(19);
		linkedListOperations.pushNodeAtFirst(77);
		linkedListOperations.pushNodeAtFirst(56);
		
		linkedListOperations.printListHead();
		System.out.println();
		linkedListOperations.pushNodeAtEnd(34);
		linkedListOperations.pushNodeAtEnd(15);
		
		linkedListOperations.printListHead();
		
		linkedListOperations.deleteFirstNode();
		
		System.out.println();
		linkedListOperations.printListHead();
		
		linkedListOperations.deleteLastNode();
		System.out.println();
		linkedListOperations.printListHead();

	}
	
	public boolean pushNodeAtFirst(int data) {
		Node node = new Node(data);
		if(head != null) {
			node.setNext(head);
			head = node;
		}else {
			head = node;
			tail = node;
		}
		
		return true;
	}
	
	public boolean pushNodeAtEnd(int data) {

		Node node = new Node(data);
		if(tail != null) {
			tail.setNext(node);
			tail = node;
		}else {
			head = node;
			tail = node;
		}
		return true;
	}
	
	public boolean deleteFirstNode() {
		
		if(head != null) {
			Node nextHead = head.getNext();
			head = null;
			if(nextHead != null) {
				head = nextHead;
			}else {
				tail = null;
			}
			
			return true;
		}
		return false;
	}
	
	public boolean deleteLastNode() {
		
		if(tail != null && head != null) {
			Node current = head.getNext();
			Node temp = head;
			if(current == null) {
				tail = null;
				head = null;
			}else {
				while(current.getNext() != null) {
					temp = temp.getNext();
					current = current.getNext();
				}
				temp.setNext(null);
				return true;
			}
		}
		
		return false;
	}
	
	public void printListHead() {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

}
