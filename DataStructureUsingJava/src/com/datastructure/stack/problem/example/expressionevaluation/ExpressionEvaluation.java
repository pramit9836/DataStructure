/**
 * 
 */
package com.datastructure.stack.problem.example.expressionevaluation;

import com.datastructure.stack.problem.example.infixtopostfix.InfixToPostfix;
import com.datastructure.stack.problem.example.infixtopostfix.InfixToPostfixApp;

/**
 * @author Pramit
 *
 */
public class ExpressionEvaluation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2*3^2+3+1";
		InfixToPostfix<Character> infixToPostfix = new InfixToPostfix<Character>(s.length());
		String postfixExpression = InfixToPostfixApp.convertToPostfix(infixToPostfix, s);
		InfixToPostfix<Long> expressionEvaluator = new InfixToPostfix<Long>(s.length());
		
		for(char ch : postfixExpression.toCharArray()) {
			switch (ch) {
			case '-':
				long value1 = (long)expressionEvaluator.pop();
				long value2 = (long)expressionEvaluator.pop();
				expressionEvaluator.push(value2 - value1);
			break;
			
			case '+':
				value1 = (long)expressionEvaluator.pop();
				value2 = (long)expressionEvaluator.pop();
				expressionEvaluator.push(value2 + value1);
			break;
			
			case '*':
				value1 = (long)expressionEvaluator.pop();
				value2 = (long)expressionEvaluator.pop();
				expressionEvaluator.push(value2 * value1);
			break;
			
			case '/':
				value1 = (long)expressionEvaluator.pop();
				value2 = (long)expressionEvaluator.pop();
				if(value1 == 0) {
					System.out.println("0 division error..expression can't be evaluated");
					return;
				}else {
					expressionEvaluator.push(value2 / value1);
				}
				
			break;
			
			case '^':
				value1 = (long)expressionEvaluator.pop();
				value2 = (long)expressionEvaluator.pop();
				expressionEvaluator.push((long)Math.pow(value2, value1));
			break;
			default:
				long data = Long.parseLong(""+ch);
				expressionEvaluator.push(data);
				break;
			}
		}
		System.out.println("Result is: "+expressionEvaluator.pop());
	}

}
