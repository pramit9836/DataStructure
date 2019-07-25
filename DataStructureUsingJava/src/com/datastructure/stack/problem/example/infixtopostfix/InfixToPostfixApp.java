/**
 * 
 */
package com.datastructure.stack.problem.example.infixtopostfix;

import java.util.HashMap;

/**
 * @author Pramit
 *
 */
public class InfixToPostfixApp {

	/**
	 * @param args
	 */
	public static final HashMap<Character, Integer> rankMap = new HashMap<>();
	static String postfixExpression = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "A*(B+C*D)+E";
		String s = "A*B^C+D";
		InfixToPostfix<Character> infixToPostfix = new InfixToPostfix<Character>(s.length());
		postfixExpression = convertToPostfix(infixToPostfix, s);
		
		System.out.println(postfixExpression);
	}
	
	public static String convertToPostfix(InfixToPostfix<Character> infixToPostfix, String s) {
		initiateRankMap();
		boolean isValidString = checkDelimiters(s);
		if(isValidString) {
			for(char ch : s.toCharArray()) {
				switch (ch) {
				case '(':
					infixToPostfix.push(ch);
					break;
				case ')':
					while(true) {
						char pickedItem = (char)infixToPostfix.peek();
						if(pickedItem == '(') {
							infixToPostfix.pop();
							break;
						}else {
							postfixExpression = postfixExpression + pickedItem;
							infixToPostfix.pop();
						}
					}
				break;
				case '-':
					pushPop(infixToPostfix, ch);
				break;
				
				case '+':
					pushPop(infixToPostfix, ch);
				break;
				
				case '*':
					pushPop(infixToPostfix, ch);
				break;
				
				case '/':
					pushPop(infixToPostfix, ch);
				break;
				
				case '^':
					pushPop(infixToPostfix, ch);
				break;
				
				default:
					postfixExpression = postfixExpression + ch;
					break;
				}
			}
		}
		if(!infixToPostfix.isEmpty()) {
			postfixExpression = postfixExpression + infixToPostfix.popAllElements();
		}
		return postfixExpression;
	}

	public static boolean checkDelimiters(String s) {
		
		InfixToPostfix<Character> delimiterChecking = new InfixToPostfix<Character>(s.length());
		for(char ch : s.toCharArray()) {
			switch(ch) {
			case '(':
			case '{':
			case '[':
				delimiterChecking.push(ch);
				break;
			case ')':
			case '}':
			case ']':
				if(!delimiterChecking.isEmpty()) {
					char popedItem = delimiterChecking.pop();
					if(popedItem==')' && ch != '(' ||
							popedItem=='}' && ch != '{' ||
							popedItem==']' && ch != '[') {
						System.out.println("String not valid..");
						return false;
					}
				}else {
					System.out.println("String is not valid..");
					return false;
				}
			}
		}
		return true;
	}
	
	public static void pushPop(InfixToPostfix<Character> infixToPostfix, char ch) {
		int currentRank = rankMap.get(ch);
		while(true) {
			if(!infixToPostfix.isEmpty()) {
				int peekItemRank = rankMap.get(infixToPostfix.peek());
				if(peekItemRank <= currentRank || infixToPostfix.peek() == '(') {
					infixToPostfix.push(ch);
					break;
				}else {
					if(infixToPostfix.peek() != '(') {
						postfixExpression = postfixExpression + infixToPostfix.pop();
					}
				}
			}else {
				infixToPostfix.push(ch);
				break;
			}
		}
	}
	

	public static void initiateRankMap() {
		// TODO Auto-generated method stub
		rankMap.put(')', 7);
		rankMap.put('(', 6);
		rankMap.put('^', 5);
		rankMap.put('/', 4);
		rankMap.put('*', 3);
		rankMap.put('+', 2);
		rankMap.put('-', 1);
		
	}

}
