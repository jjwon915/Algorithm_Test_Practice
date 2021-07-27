package sectionFive;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParenthesis {

	public String solution(String s) {
		
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x == '(')
				stack.push('(');
			else if(x == ')')
				stack.pop();
			else if(stack.isEmpty())
				answer += x;
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		RemoveParenthesis T = new RemoveParenthesis();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(T.solution(s));

	}

}
