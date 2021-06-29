package sectionOne;

import java.util.Scanner;

public class WordFlip {
	
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
		WordFlip T = new WordFlip();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			String str = in.next();
			System.out.println(T.solution(str));
		}

	}

}
