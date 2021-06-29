package sectionOne;

import java.util.ArrayList;
import java.util.Scanner;

public class WordFlip_2 {
	
	public ArrayList<String> solution(String[] s){
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : s) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		
		WordFlip_2 T = new WordFlip_2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i < n; i++) {
			str[i] = in.next();
		}
		
		for(String x : T.solution(str)) {
			System.out.println(x);
		}

	}

}
