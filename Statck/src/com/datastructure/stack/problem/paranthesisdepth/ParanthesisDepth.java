/**
 * We are given a string having parenthesis like below
     “( ((X)) (((Y))) )”
	We need to find the maximum depth of balanced parenthesis, like 4 in above example. Since ‘Y’ is surrounded by 4 balanced parenthesis.

	If parenthesis are unbalanced then return -1.
	
 */
package com.datastructure.stack.problem.paranthesisdepth;


import com.datastructure.stack.Stack;

/**
 * @author Pramit
 *
 */
public class ParanthesisDepth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "(((X))(((Y))))";
		//String s = "(p((q))((s)t))";
		String s = "b)(c)()";
		Stack<Character> stack = new Stack<>(s.length());
		int max = 0;
		int tempMax= 0;
		for(char ch : s.toCharArray()) {
			switch (ch) {
			case '(':
				stack.push(ch);
				tempMax++;
				if(tempMax > max) {
					max = tempMax;
				}
				break;
			case ')':
				if(!stack.isEmpty()) {
					stack.pop();
					tempMax--;
				}else {
					System.out.println("-1");
					return;
				}
				break;
			default:
				break;
			}
		}
		System.out.println(max);
	}
}
