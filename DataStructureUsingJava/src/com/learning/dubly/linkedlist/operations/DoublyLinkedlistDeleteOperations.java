/**
 * 
 */
package com.learning.dubly.linkedlist.operations;

import java.util.ArrayList;

/**
 * @author Pramit
 *
 */
public class DoublyLinkedlistDeleteOperations {

	/**
	 * @param args
	 */
	Node head;
	Node tail;
	
	public boolean deleteFirst() {
		if(head != null) {
			Node current = head;
			head = current.getNext();
			head.setPrev(null);
			current = null;
			return true;
		}
		return false;
	}
	
	public boolean deleteLast() {
		if(tail != null) {
			Node current = tail;
			tail = current.getPrev();
			tail.setNext(null);
			current = null;
			return true;
		}
		return false;
	}
	
	public boolean deleteSpecificNode(int data) {
		Node current = head;
		if(head == null) {
			return false;
		}else if(head.getData() == data) {
			Node next = current.getNext();
		}
		
		return false;
	}
	
	public boolean bulkInsertion(ArrayList<Double> dataList) {
		
		for(double data : dataList) {
			Node node = new Node(data);
			Node temp = tail;
			if(head == null && tail == null) {
				head = tail = node;
			}else {
				node.setPrev(temp);
				temp.setNext(node);
				tail = node;
			}
		}
		return false;
	}
	
	public void forwardPrint() {
		if(head != null && tail != null) {
			Node current = head;
			while(current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> dataList = new ArrayList<Double>();
		dataList.add((double) 37);
		dataList.add((double) 65);
		dataList.add((double) 19);
		dataList.add((double) 54);
		
		DoublyLinkedlistDeleteOperations doublyLinkedlistDeleteOperations = new DoublyLinkedlistDeleteOperations();
		doublyLinkedlistDeleteOperations.bulkInsertion(dataList);
		doublyLinkedlistDeleteOperations.deleteFirst();
		doublyLinkedlistDeleteOperations.deleteLast();
		doublyLinkedlistDeleteOperations.forwardPrint();
	}

}
