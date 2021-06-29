package sectionOne;

import java.util.ArrayList;
import java.util.Scanner;

public class WordFlip_3 {
	
	public ArrayList<String> solution(String[] s){
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : s) {
			char[] arr = x.toCharArray();
			int lt = 0;
			int rt = arr.length - 1;
			while(!(lt >= rt)) {
				char c = arr[rt];
				arr[rt] = arr[lt];
				arr[lt] = c;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(arr);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		
		WordFlip_3 T = new WordFlip_3();
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
