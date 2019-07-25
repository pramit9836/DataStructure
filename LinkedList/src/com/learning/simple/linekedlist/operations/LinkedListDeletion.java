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
public class LinkedListDeletion {

	Node head;
	
	/**
	 * This method will delete the first element of the list
	 * 
	 */
	public void removeFirstNode() {
		Node current = head.next;
		head = null;
		head = current;
	}
	
	/**
	 * This method will remove the last node of the linked list
	 */
	public void removeLastNode() {
		Node current = head;
		Node prev = null;
		while(current.next != null) {
			prev = current;
			current = current.next;
		}
		prev.next = null;
	}
	
	/**
	 * This method will delete a specific data node
	 * @param data : the data which not need to delete
	 */
	public void removeSpecificDataNode(int data) {
		
		Node current = head;
		Node prev = null;
		if(head.data.equals(data)) {
			head = head.next;
			return;
		}else {
			while(current.next != null) {
				prev = current;
				current = current.next;
				if(current.data.equals(data)) {
					prev.next = current.next;
					break;
				}
			}
		}
	}
	
	/**
	 * This method will removes node from a given position
	 * @param position : position of the node which need to be deleted
	 */
	public void removeNodeFromSpecificPostion(int position) {
		Node current = head;
		Node prev = null;
		int counter = 2;
		if(position == 1) {
			head = head.next;
			return;
		}else {
			while(current.next != null) {
				prev = current;
				current = current.next;
				if(counter == position) {
					prev.next = current.next;
					break;
				}
				counter++;
			}
		}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDeletion linkedListDeletion = new LinkedListDeletion();
		Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7};
		List<Integer> dataList = Arrays.asList(intArray);
		linkedListDeletion.bulkInsertion(dataList);
		//linkedListDeletion.removeFirstNode();
		//linkedListDeletion.removeLastNode();
		//linkedListDeletion.removeSpecificDataNode(5);
		linkedListDeletion.removeNodeFromSpecificPostion(1);
		linkedListDeletion.printList();
	}

}
