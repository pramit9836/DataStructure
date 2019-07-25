/**
 * 
 */
package com.datastructure.stack.problem.example.infixtopostfix;

/**
 * @author Pramit
 *
 */
public class InfixToPostfix<T extends Object> {
	private T[] stack;
	private int top;
	private static int stackSize;
	
	@SuppressWarnings("unchecked")
	public InfixToPostfix(int length) {
		super();
		top = -1;
		stackSize = length;
		stack = (T[])new Object[length];
	}
	
	public boolean push(T item) {
		top++;
		if(stack != null && top <= stackSize-1) {
			stack[top] = item;
		}else if(top >= stackSize) {
			top--;
			printError("Stack Overflow");
			return false;
		}
		return true;
	}
	
	public T pop() {
		T ch = null;
		if(stack != null && top <= stackSize-1 && top > -1) {
			ch = stack[top];
			top--;
		}else {
			printError("Stack Underflow");
			//return false;
		}
		return ch;
	}
	
	public boolean isEmpty() {
		if(top < 0)
			return true;
		return false;
	}
	
	public T peek() {
		if(top > -1) {
			return stack[top];
		}else
			return null;
	}
	
	public String popAllElements() {
		String s = "";
		while(true) {
			if(isEmpty()) {
				break;
			}else {
				s = s + pop();
			}
		}
		return s;
	}
	
	public void printStack() {
		for(int i=top; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	public void printError(String msg) {
		System.out.println(msg);
	}
}
