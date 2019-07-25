/**
 * 
 */
package com.learning.dubly.linkedlist.operations;

/**
 * @author Pramit
 *
 */
public class DoublyLinkedlistInsertOperations {

	/**
	 * @param args
	 */
	
	Node head;
	Node tail;
	
	public boolean insertFirst(double data) {
		
		Node node = new Node(data);
		if(head == null && tail==null) {
			head = tail = node;
			return true;
		}else {
			head.setPrev(node);
			node.setNext(head);
			node.setPrev(null);
			head = node;
			return true;
		}
	}
	
	public boolean insertLast(double data) {
		
		Node node = new Node(data);
		if(head == null && tail==null) {
			head = tail = node;
			return true;
		}else {
			tail.setNext(node);
			node.setPrev(tail);
			node.setNext(null);
			tail = node;
			return true;
		}
		
	}
	
	public boolean insertAfterNode(double data, double positionData) {
		
		Node node = new Node(data);
		if(head == null && tail == null) {
			return false;
		}else {
			Node current  = head;
			while(current.getNext() != null) {
				if(current.getData() == positionData) {
					Node nextNode = current.getNext();
					current.setNext(node);
					node.setNext(nextNode);
					node.setPrev(current);
					return true;
				}
				current = current.getNext();
			}
			if(current.getData() == positionData) {
				node.setPrev(current);
				current.setNext(node);
				tail = current;
				return true;
			}
		}
		return false;
	}
	
	public boolean insertBeforeNode(double data, double positionData) {
		Node node = new Node(data);
		Node current = head;
		if(head == null && tail == null) {
			return false;
		}else {
			if(positionData == head.getData()) {
				node.setPrev(null);
				node.setNext(head);
				head.setPrev(node);
				head = node;
				return true;
			}else {
				while(current != null) {
					if(current.getData() == positionData) {
						node.setPrev(current.getPrev());
						current.getPrev().setNext(node);
						node.setNext(current);
						current.setPrev(node);
						return true;
					}
					current = current.getNext();
				}
			}
		}
		return false;
	}
	
	public void forwardPrinting() {
		Node current = head;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public void backwardPrinting() {
		Node current = tail;
		while(current != null) {
			System.out.println(current.getData());
			current = current.getPrev();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedlistInsertOperations doublyLinkedlistInsertOperations = new DoublyLinkedlistInsertOperations();
		
		doublyLinkedlistInsertOperations.insertFirst(10);
		doublyLinkedlistInsertOperations.insertFirst(77);
		
		System.out.println(doublyLinkedlistInsertOperations.insertBeforeNode(91, 77));
		doublyLinkedlistInsertOperations.insertBeforeNode(38, 10);
		doublyLinkedlistInsertOperations.forwardPrinting();
		/*System.out.println(doublyLinkedlistOperations.insertAfterNode(89, 23));
		doublyLinkedlistOperations.insertFirst(10);
		doublyLinkedlistOperations.insertFirst(77);
		System.out.println(doublyLinkedlistOperations.insertAfterNode(89, 10.0));
		doublyLinkedlistOperations.forwardPrinting();
		System.out.println(doublyLinkedlistOperations.insertAfterNode(43, 10.0));
		doublyLinkedlistOperations.forwardPrinting();*/
		
		/*System.out.println();
		doublyLinkedlistOperations.backwardPrinting();
		
		doublyLinkedlistOperations.insertLast(56);
		doublyLinkedlistOperations.insertLast(34);
		
		System.out.println();
		doublyLinkedlistOperations.forwardPrinting();
		System.out.println();
		doublyLinkedlistOperations.backwardPrinting();
*/
	}

}