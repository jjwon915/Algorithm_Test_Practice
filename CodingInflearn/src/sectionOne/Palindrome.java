package sectionOne;

import java.util.Scanner;

public class Palindrome {

	public String solution(String str) {
		
		int lt = 0;
		int rt = str.length() - 1;
		str = str.toUpperCase();
		char[] arr = str.toCharArray();
		
		while(!(lt >= rt)) {
			if(!(arr[lt] == arr[rt])) {
				return "NO";
			}
			lt++;
			rt--;
		}
		
		return "YES";
		
	}
	
	public static void main(String[] args) {
		
		Palindrome T = new Palindrome();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
