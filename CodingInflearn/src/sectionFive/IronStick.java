package sectionFive;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

	public int solution(String s) {
		
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x == '(')
				stack.push('(');
			else {
				if(s.charAt(i - 1) == '(') {
					stack.pop();
					answer += stack.size();
				}
				else {
					stack.pop();
					answer++;
				}
			}
		}
		
		return answer;
	
	}
	
	public static void main(String[] args) {
		
		IronStick T = new IronStick();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(T.solution(s));

	}

}
