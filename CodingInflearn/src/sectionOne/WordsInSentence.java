package sectionOne;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsInSentence {
	
	public String solution(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		String answer = "";
		int max = Integer.MIN_VALUE;
		String tmp;
		
		while(st.hasMoreTokens()) {
			tmp = st.nextToken();
			if(tmp.length() > max) {
				max = tmp.length();
				answer = tmp;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		WordsInSentence T = new WordsInSentence();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));

	}

}
