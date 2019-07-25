/**
 * 
 */
package com.datastructure.stack;

/**
 * @author Pramit
 *
 */
public class StackApplicationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>(10);
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.push(23);
		stack.push(9);
		stack.push(76);
		stack.push(92);
		stack.push(283);
		stack.push(78);
		stack.push(78);
		stack.pop();
		stack.push(92);
		System.out.println("Peek item is: "+stack.peek());
		stack.printStack();
	}

}
