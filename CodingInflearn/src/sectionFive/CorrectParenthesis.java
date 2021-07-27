package sectionFive;

import java.util.Scanner;

public class CorrectParenthesis {

	public String solution(String s) {
		
		String answer = "YES";
		int count = 0;
		
		for(char x : s.toCharArray()) {
			if(x == '(')
				count++;
			else
				count--;
			if(count < 0) {
				answer = "NO";
				break;
			}
		}
		
		if(count != 0)
			answer = "NO";
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		CorrectParenthesis T = new CorrectParenthesis();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(T.solution(s));

	}

}
