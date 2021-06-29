package sectionOne;

import java.util.Scanner;

public class Deduplication {
	
	public String solution(String str) {
		int[] arr = new int[26];
		StringBuilder answer = new StringBuilder();
		for(char x : str.toCharArray()) {
			int a = x - 'a';
			if(arr[a] == 0) {
				answer.append(x);
				arr[a]++;
			}
		}
		
		return answer.toString();
	}

	public static void main(String[] args) {
		
		Deduplication T = new Deduplication();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
