package sectionOne;

import java.util.Scanner;

public class Palindrome_2 {

	public String solution(String str) {
		
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp))
			answer = "YES";
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Palindrome_2 T = new Palindrome_2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
