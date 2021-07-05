package sectionOne;

import java.util.Scanner;

public class CompressionString {

	public String solution(String str) {
		
		String answer = "";
		int count = 0;
		char c = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if(count == 0) {
				c = x;
				count++;
			}
			else if(x == c) {
				count++;
			}
			else {
				if(count != 1) {
					answer += c;
					answer += count;
					c = x;
					count = 1;
				}
				else {
					answer += c;
					c = x;
					count = 1;
				}
			}
			
		}
		
		answer += c;
		if(count != 1)
			answer += count;
		
		return answer;

	}
	
	public static void main(String[] args) {
		
		CompressionString T = new CompressionString();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
