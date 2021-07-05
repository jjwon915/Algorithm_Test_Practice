package sectionOne;

import java.util.Arrays;
import java.util.Scanner;

public class ShortDistance {
	
	public int[] solution(String str, char c) {
		
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				answer[i] = 0;
				p = 0;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		
		for(int i = str.length() - 1; i >= 0; i--) {
			if(answer[i] == 0)
				p = 0;
			else {
				p++;
				if(p < answer[i])
					answer[i] = p;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		ShortDistance T = new ShortDistance();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		char c = in.next().charAt(0);
		
		for(int x : T.solution(str, c)) {
			System.out.print(x + " ");
		};

	}

}
