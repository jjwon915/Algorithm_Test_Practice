package sectionOne;

import java.util.Scanner;

public class Deduplication_2 {
	
	public String solution(String str) {
		
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Deduplication_2 T = new Deduplication_2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
