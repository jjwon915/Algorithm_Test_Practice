package sectionOne;

import java.util.Scanner;

public class ExtractNumbers_2 {
	
	public int solution(String str) {
		
		int answer = 0;
		
		for(char x : str.toCharArray()) {
			if(x >= '0' && x <= '9')
				answer = answer * 10 + ((int)x - '0');
		}
		
		return answer;
	
	}
	
	public static void main(String[] args) {
		
		ExtractNumbers T = new ExtractNumbers();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
		
	}

}
