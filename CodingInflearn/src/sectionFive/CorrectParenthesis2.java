package sectionFive;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis2 {

	public String solution(String s) {
		
		String answer = "YES";

		Stack<Character> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(x == '(')
				stack.push('(');
			else if(stack.isEmpty()) {
				answer = "NO";
				break;
			}
			else
				stack.pop();
		}
		
		if(!stack.isEmpty())
			answer = "NO";
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		CorrectParenthesis2 T = new CorrectParenthesis2();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(T.solution(s));

	}

}
