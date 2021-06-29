package sectionOne;

import java.util.Scanner;

public class FlipSpecific_2 {

	public String solution(String str) {
		String answer = "";
		int lt = 0;
		int rt = str.length() - 1;
		char[] arr = str.toCharArray();
		while(!(lt >= rt)) {
			char c = arr[lt];
			char r = arr[rt];
			if(!Character.isAlphabetic(c)) {
				lt++;
			}
			else if(!Character.isAlphabetic(r)) {
				rt--;
			}
			else {
				char tmp = c;
				arr[lt] = arr[rt];
				arr[rt] = c;
				lt++;
				rt--;
			}
		}
		answer = String.copyValueOf(arr);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		FlipSpecific_2 T = new FlipSpecific_2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
