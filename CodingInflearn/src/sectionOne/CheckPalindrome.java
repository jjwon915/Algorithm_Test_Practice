package sectionOne;

import java.util.Scanner;

public class CheckPalindrome {

	public String solution(String str) {
		
		String answer = "YES";
		str = str.toUpperCase();
		char[] arr = str.toCharArray();
		int rt = str.length() - 1;
		int lt = 0;
		
		while(!(lt >= rt)) {
			if(!Character.isAlphabetic(arr[lt]))
				lt++;
			else if(!Character.isAlphabetic(arr[rt]))
				rt--;
			else {
				if(arr[lt] != arr[rt]) {
					answer = "NO";
					break;
				}
				lt++;
				rt--;
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		CheckPalindrome T = new CheckPalindrome();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));

	}

}
