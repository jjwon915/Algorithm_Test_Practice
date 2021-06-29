package sectionOne;

import java.util.Scanner;

public class TransUpperLower_2 {

	public String solution(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
			if(Character.isLowerCase(x)) 
				answer += Character.toUpperCase(x);
			else
				answer += Character.toLowerCase(x);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		TransUpperLower_2 T = new TransUpperLower_2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
