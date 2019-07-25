/**
 * 
 */
package com.datastructure.queue;

/**
 * @author Pramit
 *
 */
public class Queue<T extends Object> {
	
	T[] queue;
	int front;
	int rear;
	int queueSize;
	
	@SuppressWarnings("unchecked")
	public Queue(int length) {
		// TODO Auto-generated constructor stub
		queue = (T[])new Object[length];
		front = -1;
		rear = -1;
		queueSize = length;
	}
	
	public boolean insert(T data) {
		
		if(queue != null && rear <= queueSize-1) {
			if(rear == queueSize -1 && front > 0) {
				rear = -1;
			}
			rear++;
			queue[rear] = data;
			
			if(front == -1)
				front++;
		}else {
			System.out.println("Queue overflow");
			return false;
		}
		return true;
	}
	
	public T remove() {
		T removedData = null;
		if(queue != null && front > -1) {
			if(front < rear) {
				removedData = queue[front];
				front++;
			}else {
				removedData = queue[front];
				front++;
				if(front == queueSize-1) {
					front = -1;
				}
			}
		}
		return removedData;
	}
	
	public T front() {
		T data =null;
		if(front >= 0)
			data = queue[front];
		return data;
	}
	
	public T rear() {
		T data =null;
		if(rear >= 0)
			data = queue[rear];
		return data;
	}
	public boolean isEmpty() {
		boolean isEmpty = true;
		if(front >= 0) {
			isEmpty = false;
		}
		return isEmpty;
	}
	
	public void printQueue() {
		if(queue != null && front>=0 && rear >=0) {
			if(front < rear) {
				for(int i=front; i<=rear; i++) {
					System.out.println(queue[i]);
				}
			}else {
				for(int i=front; i<queueSize; i++) {
					System.out.println(queue[i]);
				}
				for(int i=0; i<=rear; i++) {
					System.out.println(queue[i]);
				}
			}
			
		}
	}

}
