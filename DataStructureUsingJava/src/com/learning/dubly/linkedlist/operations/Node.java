/**
 * 
 */
package com.learning.dubly.linkedlist.operations;

/**
 * @author Pramit
 *
 */
public class Node {
	
	private double data;
	private Node prev;
	private Node next;
	
	public Node(double data) {
		this.data = data;
		prev = null;
		next = null;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
