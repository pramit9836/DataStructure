/**
 * 
 */
package com.learning.simple.linekedlist.operations;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pramit
 *
 */
public class LinkedListLength {
	
	Node head;
	
	/**
	 * This method will give the length of the linked list
	 * @return
	 */
	public int getLength() {
		Node node = head;
		return getLengthRec(node);
	}
	
	public int getLengthRec(Node node) {
		// TODO Auto-generated method stub
		
		if(node == null) {
			return 0;
		}
		return 1 + getLengthRec(node.next);
	}
	
	/**
	 * This method will search for a specific data in the list
	 * @param data
	 * @return
	 */
	public boolean search(int data) {
		Node node = head;
		return searchRec(data,node);
	}
	
	private boolean searchRec(int data, Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return false;
		}
		if(node.getData().equals(data)) {
			return true;
		}
		return searchRec(data, node.next);
	}

	/**
	 * This method push nodes one after another in a bulk
	 * @param dataList : list of node values
	 * 
	 */
	public void bulkInsertion(List<Integer> dataList) {
		for(int data : dataList) {
			if(head == null) {
				Node newNode  = new Node(data);
				head = newNode;
			}else {
				Node newNode  = new Node(data);
				Node current = head;
				while(current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
		}
	}
	
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListLength linkedListLength = new LinkedListLength();
		Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7};
		List<Integer> dataList = Arrays.asList(intArray);
		linkedListLength.bulkInsertion(dataList);
		linkedListLength.printList();
		System.out.println("length of the list is::"+linkedListLength.getLength());
		System.out.println("Data found::"+linkedListLength.search(1));

	}

}
