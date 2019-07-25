package com.learning.datastructure.array;


/**
 * @author Pramit
 *
 */

public class ArrayOperations {
	
	private int[] array;
	private int index;
	private static int length;
	public ArrayOperations(int arraySize) {
		super();
		array = new int[arraySize];
		index = 0;
		length = arraySize;
	}
	
	public void insert(int element) {
		if(index < length) {
			array[index] = element;
			index++;
		}else {
			printErrorMsg("Unable to insert element: "+element+" ..Array index out of bound..");
		}
	}
	
	public void orderedInsert(int element) {
		int position=0;
		boolean isBiggest = false;
		for(int i=1; i <= index ; i++) {
			if(i == 1 && array[i-1] != 0 && array[i-1] > element) {
				//isSmallest = true;
				position = 0;
				break;
			}
			if(array[i-1] < element && array[i] > element) {
				position = i;
				break;
			}else if(i == index && element > array[i]) {
				position = index;
				isBiggest = true;
			}
		}
		if(isBiggest) {
			array[index] = element;
			index++;
		}else {
			int nextElement = array[position];
			for(int i = position; i <= index; i++) {
				int nxtNxt = array[i+1];
				array[i+1] = nextElement;
				nextElement = nxtNxt;
			}
			array[position] = element;
			index++;
		}
	}
	
	public void remove(int element) {
		boolean isFound = false;
		for(int i=0; i<=index; i++) {
			if(array[i] == element) {
				isFound = true;
				for(int j=i+1; j<index; j++,i++) {
					array[i] = array[j];
				}
				index--;
				array[index] = 0;
				break;
			}
		}
		if(!isFound) {
			printErrorMsg(element + " Not found in the array");
		}
	}
	
	public void binarySerach(int searchItem) {
		int lower = 0;
		int upper = index-1;
		while(true) {
			int mid = (lower+upper)/2;
			if(array[mid] == searchItem) {
				System.out.println("Item found @ "+mid );
				break;
			}else {
				if(array[mid] < searchItem) {
					lower = mid+1;
				}else {
					upper = mid-1;
				}
			}
		}
		recursiveBinarySearch(upper, lower, 9);
	}
	
	public void recursiveBinarySearch(int upper, int lower, int item) {
		int mid = (lower+upper)/2;
		if(array[mid] == item)
			System.out.println("true");
		else {
			if(array[mid] < item) {
				lower = mid+1;
				recursiveBinarySearch(upper, lower, item);
			}else {
				upper = mid-1;
				recursiveBinarySearch(upper, lower, item);
			}
		}
	}
	
	public void printArray() {
		
		for(int i : array) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	
	public void printErrorMsg(String msg) {
		System.out.println(msg);
	}
	

}
