package programmers;

import java.util.Scanner;

public class MakeJadenCase {
	
	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String a = "";
		answer.append(a);
		for(int i = 0; i < s.length(); i++) {
			a = Character.toString(s.charAt(i));
			if(i == 0) {
				answer.append(a.toUpperCase());
			}
			else if(s.charAt(i) == ' ') {
				answer.append(" ");
			}
			else if(s.charAt(i - 1) == ' ') {
				answer.append(a.toUpperCase());
			}
			else {
				answer.append(a.toLowerCase());
			}
		}
        return answer.toString();
    }

	public static void main(String[] args) {
		MakeJadenCase T = new MakeJadenCase();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(T.solution(s));
	}

}
