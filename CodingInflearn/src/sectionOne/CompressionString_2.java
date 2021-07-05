package sectionOne;

import java.util.Scanner;

public class CompressionString_2 {

	public String solution(String str) {
		
		String answer = "";
		int count = 1;
		str += " ";
		
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
			else {
				answer += str.charAt(i);
				if(count != 1) {
					answer += count;
				}
				count = 1;
			}
		}
		
		return answer;

	}
	
	public static void main(String[] args) {
		
		CompressionString_2 T = new CompressionString_2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
