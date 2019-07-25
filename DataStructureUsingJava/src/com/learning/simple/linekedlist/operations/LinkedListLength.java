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
	
	Node<Object> head;
	
	/**
	 * This method will give the length of the linked list
	 * @return
	 */
	public int getLength() {
		Node<Object> node = head;
		return getLengthRec(node);
	}
	
	public int getLengthRec(Node<Object> node) {
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
		Node<Object> node = head;
		return searchRec(data,node);
	}
	
	private boolean searchRec(int data, Node<Object> node) {
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
	public void bulkInsertion(List<Object> dataList) {
		for(Object data : dataList) {
			if(head == null) {
				Node<Object> newNode = new Node<Object>(data);
				head = newNode;
			}else {
				Node<Object> newNode = new Node<Object>(data);
				Node<Object> current = head;
				while(current.next != null) {
					current = current.next;
				}
				current.next = newNode;
			}
		}
	}
	
	public void printList() {
		Node<Object> current = head;
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
		Object[] intArray = new Object[]{ 1,2,3,4,5,6,7};
		List<Object> dataList = Arrays.asList(intArray);
		linkedListLength.bulkInsertion(dataList);
		linkedListLength.printList();
		System.out.println("length of the list is::"+linkedListLength.getLength());
		System.out.println("Data found::"+linkedListLength.search(1));

	}

}
