package sectionOne;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsInSentence_2 {
	
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		// 빈칸을 통해 String 배열로 변환.
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		WordsInSentence_2 T = new WordsInSentence_2();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));

	}

}
