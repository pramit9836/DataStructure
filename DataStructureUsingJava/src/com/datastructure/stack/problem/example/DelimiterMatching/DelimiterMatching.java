package com.datastructure.stack.problem.example.DelimiterMatching;

public class DelimiterMatching {
	


	private char[] stack;
	private int top;
	private static int stackSize;
	
	public DelimiterMatching(int length) {
		super();
		top = -1;
		stackSize = length;
		stack = new char[length];
	}
	
	public boolean push(char item) {
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
	
	public char pop() {
		char ch = 0;
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
	
	public long peek() {
		if(top > -1) {
			return stack[top];
		}else
			return -1;
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
