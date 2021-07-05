package sectionOne;

import java.util.Scanner;

public class Password_2 {

	public String solution(String str, int n) {
		
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			answer += (char)(Integer.parseInt(tmp, 2));
			str = str.substring(7);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Password_2 T = new Password_2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		System.out.println(T.solution(str, n));

	}

}
