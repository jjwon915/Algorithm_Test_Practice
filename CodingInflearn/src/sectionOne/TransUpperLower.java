package sectionOne;

import java.util.Scanner;

public class TransUpperLower {

	public void solution(String s) {
		StringBuilder sb = new StringBuilder();
		int a;
		for(int i = 0; i < s.length(); i++) {
			if((int)s.charAt(i) >= 97) {
				a = s.charAt(i) - 32;
				sb.append((char)a);
			}
			else {
				a = s.charAt(i) + 32;
				sb.append((char) a);
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		
		TransUpperLower T = new TransUpperLower();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		T.solution(str);

	}

}
