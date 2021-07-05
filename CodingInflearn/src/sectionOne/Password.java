package sectionOne;

import java.util.Scanner;

public class Password {

	public String solution(String str, int n) {
		
		int count = 0;
		int sum = 0;
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '#')
				sum = sum * 2 + 1;
			else
				sum = sum * 2;
			count++;
			if(count % 7 == 0) {
				answer += (char)sum;
				sum = 0;
				count = 0;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Password T = new Password();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		System.out.println(T.solution(str, n));

	}

}
