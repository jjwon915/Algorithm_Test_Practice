package programmers;

import java.util.Scanner;

public class MiddleLetter {
	
	public String solution(String str) {
		String answer = "";
		int n = str.length();
		if(n % 2 != 0) {
			answer = str.substring(n / 2, (n / 2) +1);
		}
		else {
			answer = str.substring(n / 2 - 1, (n / 2) + 1);
		}
		return answer;
	}

	public static void main(String[] args) {
		MiddleLetter T = new MiddleLetter();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
	}

}
