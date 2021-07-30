package sectionFive;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

	public int solution(String s) {
		
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x))
				stack.push(x - '0');
			else if(x == '+')
				stack.push(stack.pop() + stack.pop());
			else if(x == '-') {
				int tmp = -(stack.pop());
				stack.push(stack.pop() + tmp);
			}
			else if(x == '*')
				stack.push(stack.pop() * stack.pop());
			else if(x == '/') {
				int tmp = stack.pop();
				stack.push(stack.pop() / tmp);
			}
		}
		answer = stack.pop();
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Postfix T = new Postfix();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(T.solution(s));

	}

}
