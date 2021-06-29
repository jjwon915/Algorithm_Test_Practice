package sectionOne;

import java.util.Scanner;

public class FlipSpecific {

	public String solution(String str) {
		String answer = "";
		int lt = 0;
		int rt = str.length() - 1;
		char[] arr = str.toCharArray();
		while(!(lt >= rt)) {
			char c = arr[lt];
			char r = arr[rt];
			if((c >= 65 && c <= 90) || (c >= 97 && c <= 120)) {
				if((r >= 65 && r <= 90) || (r >= 97 && r <= 120)) {
					char tmp = c;
					arr[lt] = arr[rt];
					arr[rt] = c;
					lt++;
					rt--;
				}
				else {
					rt--;
				}
			}
			else {
				if((r >= 65 && r <= 90) || (r >= 97 && r <= 120)) {
					lt++;
				}
				else {
					lt++;
					rt--;
				}
			}
		}
		answer = String.copyValueOf(arr);
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		FlipSpecific T = new FlipSpecific();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
