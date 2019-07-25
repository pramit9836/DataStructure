package com.learning.simple.linekedlist.operations;

/**
 * @author Pramit
 *
 */
import java.util.List;

public class LinkedListInsertion {
	
	Node head;
	
	/**
	 * Inserts a node in front of the the list
	 * @param data : pass the data that need to be added in list
	 * 
	 */
	public void pushNode(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	/**
	 * This method will add a node at the last of the list
	 * @param data
	 */
	public void pushAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	/**
	 * This method will insert a node after a given position
	 * @param data : value of the node
	 * @param position : the position, after the node will be inserted
	 * 
	 */
	public void pushInGivenPosition(int data, int position) {
		
		Node newNode = new Node(data);
		Node current = head;
		int counter = 1;
		boolean isInserted = false;
		while(current.next != null) {
			if(counter != position) {
				current = current.next;
				counter++;
			}else {
				newNode.next = current.next;
				current.next = newNode;
				isInserted = true;
				break;
			}
		}
		if(!isInserted) {
			System.out.println("Position out of range..Please provide position with in the range "+counter);
		}
	}
	
	/**
	 * This method will insert a node after a particular node value
	 * @param data : value of the node
	 * @param nodeValue : value of the node after which the new node will be inserted
	 */
	public void pushAfterGivenDataNode(int data, int nodeValue) {
		Node newNode = new Node(data);
		Node current = head;
		boolean isInserted = false;
		while(current.next != null) {
			if(!current.getData().equals(nodeValue)) {
				current = current.next;
			}else {
				newNode.next = current.next;
				current.next = newNode;
				isInserted = true;
				break;
			}
		}
		if(!isInserted) {
			System.out.println("Given data value is not present in the list..");
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
			System.out.println((current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListInsertion linkedListInsertion = new LinkedListInsertion();
		//linkedListInsertion.pushNode(5);
		//linkedListInsertion.pushNode(6);
		linkedListInsertion.pushAtEnd(7);
		linkedListInsertion.pushAtEnd("saikat");
		linkedListInsertion.pushInGivenPosition(8, 2);
		linkedListInsertion.pushAfterGivenDataNode(9, 5);
		/*Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7};
		List<Integer> dataList = Arrays.asList(intArray);*/
		linkedListInsertion.printList();

	}

}
