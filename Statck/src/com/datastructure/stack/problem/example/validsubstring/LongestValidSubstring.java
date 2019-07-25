/**
 * Length of the longest valid substring
	Given a string consisting of opening and closing parenthesis, find length of the longest valid parenthesis substring.

	Examples:

	Input : ((()
	Output : 2
	Explanation : ()

	Input: )()())
	Output : 4
	Explanation: ()() 

	Input:  ()(()))))
	Output: 6
	Explanation:  ()(())
 * 
 */
package com.datastructure.stack.problem.example.validsubstring;

import com.datastructure.stack.Stack;

/**
 * @author Pramit
 *
 */
public class LongestValidSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "()(()))))";
		String s = "(((((";
		Stack<Character> stack = new Stack<>(s.length());
		int maxLength = 0;
		for(char ch : s.toCharArray()) {
			if(ch == '(') {
				stack.push(ch);
			}else {
				if(!stack.isEmpty()) {
					stack.pop();
					maxLength += 2;
				}
			}
		}
		System.out.println(maxLength);
	}

}
