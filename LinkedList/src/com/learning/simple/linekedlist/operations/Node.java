/**
 * 
 */
package com.learning.simple.linekedlist.operations;

/**
 * @author Pramit
 *
 */
public class Node<T extends Object> {
	T data;
	Node<T> next;
	public Node(T data){
		this.data = data;
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
