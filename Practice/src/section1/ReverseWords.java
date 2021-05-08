package section1;

import java.util.Scanner;

public class ReverseWords {
	public String solution(String str) {
		String answer = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			answer = answer + str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		ReverseWords test = new ReverseWords();
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str;
		
		for(int i = 0; i < n; i++) {
			str = in.next();
			System.out.println(test.solution(str));
		}
	}

}
