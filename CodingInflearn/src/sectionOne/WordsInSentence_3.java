package sectionOne;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsInSentence_3 {
	
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		int pos;
		
		while((pos = str.indexOf(" "))!= -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		
		// 마지막 단어 길이 구하기.
		if(str.length() > max)
			answer = str;
		
		return answer;
	}

	public static void main(String[] args) {
		
		WordsInSentence_2 T = new WordsInSentence_2();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));

	}

}
