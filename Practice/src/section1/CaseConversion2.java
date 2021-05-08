package section1;

import java.util.Scanner;

public class CaseConversion2 {
	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}
			else {
				answer += Character.toLowerCase(x);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		CaseConversion2 T = new CaseConversion2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));

	}

}
