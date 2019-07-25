/**
 * 
 */
package com.datastructure.stack.problem.example.DelimiterMatching;

/**
 * @author Pramit
 *
 */
public class DelimiterMatchingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "a{b(c[d]e)f}";
		DelimiterMatching delimiterMatching = new DelimiterMatching(s.length());
		
		for(char ch : s.toCharArray()) {
			switch(ch) {
			case '(':
			case '{':
			case '[':
				delimiterMatching.push(ch);
				break;
			case ')':
			case '}':
			case ']':
				if(!delimiterMatching.isEmpty()) {
					char popedItem = delimiterMatching.pop();
					if(popedItem==')' && ch != '(' ||
							popedItem=='}' && ch != '{' ||
							popedItem==']' && ch != '[') {
						System.out.println("String not valid..");
						return;
					}
				}else {
					System.out.println("String is not valid..");
					return;
				}
			}
		}
		
		if(delimiterMatching.isEmpty()) {
			System.out.println("String is valid..");
		}

	}
	
}
