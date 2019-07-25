/**
 * 
 */
package com.learning.datastructure.array;

/**
 * @author Pramit
 *
 */
public class ArrayOperationsCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayOperations arrayOpertaions = new ArrayOperations(8);
		/*arrayOpertaions.insert(10);
		arrayOpertaions.insert(50);
		arrayOpertaions.insert(39);
		arrayOpertaions.insert(93);
		arrayOpertaions.insert(28);
		arrayOpertaions.insert(5);
		//arrayOpertaions.insert(130);
		arrayOpertaions.insert(105);
		arrayOpertaions.insert(74);
		arrayOpertaions.insert(64);
		
		arrayOpertaions.printArray();
		
		arrayOpertaions.remove(39);
		arrayOpertaions.remove(123565);
		
		arrayOpertaions.printArray();
		
		arrayOpertaions.insert(130);
		arrayOpertaions.printArray();*/
		
		arrayOpertaions.orderedInsert(3);
		arrayOpertaions.orderedInsert(1);
		arrayOpertaions.orderedInsert(5);
		arrayOpertaions.orderedInsert(0);
		arrayOpertaions.orderedInsert(2);
		//arrayOpertaions.remove(2);
		arrayOpertaions.binarySerach(5);
		arrayOpertaions.printArray();
	}

}
