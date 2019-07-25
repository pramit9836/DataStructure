/**
 * 
 */
package com.learning.simple.linkedlist.manipulations;

import java.util.Arrays;
import java.util.List;

/**
 * @author Pramit
 *
 */
public class SwapNodes {

	Node head;
	
	public void swapNodes(int x, int y) {
		
		if(x == y) return;
		
		Node currentX = head;
		Node prevX = currentX;
		while(currentX != null && currentX.data != x) {
			prevX = currentX;
			currentX = currentX.next;
		}
		
		Node currentY = head;
		Node prevY = currentY;
		while(currentY != null && currentY.data != y) {
			prevY = currentY;
			currentY = currentY.next;
		}
		
		if(currentX == null || currentY == null) return;
		
		
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

		SwapNodes swapNodes = new SwapNodes();
		Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7};
		List<Integer> dataList = Arrays.asList(intArray);
		swapNodes.bulkInsertion(dataList);
		swapNodes.printList();
	}

}
