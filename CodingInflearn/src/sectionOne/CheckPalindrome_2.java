package sectionOne;

import java.util.Scanner;

public class CheckPalindrome_2 {

	public String solution(String str) {
		
		String answer = "NO";
		/**
		 *  [^A-Z] : 알파벳 A-Z까지가 아니면,
		 *  "" : "" 로 replace한다.
		 */
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(tmp.equals(str))
			answer = "YES";
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		CheckPalindrome_2 T = new CheckPalindrome_2();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));

	}

}
