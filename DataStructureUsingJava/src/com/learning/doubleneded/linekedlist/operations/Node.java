/**
 * 
 */
package com.learning.doubleneded.linekedlist.operations;

/**
 * @author Pramit
 *
 */
public class Node {
	
	private Node next;
	private int data;
	
	
	public Node(int data) {
		super();
		this.next = null;
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node node) {
		this.next = node;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
