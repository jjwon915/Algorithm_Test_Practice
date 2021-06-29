package sectionOne;

import java.util.Scanner;

public class FindCharacter_2 {

	public int solution(String str, String s) {
		int result = 0;
		char c = s.charAt(0);
		/**
		 *  향상된 for문
		 *  char x : str로 쓰면 안된다.
		 *  str을 배열로 변환해야  사용가능.
		 */		
		for(char x : str.toCharArray()) {
			if(x == c)
				result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		FindCharacter_2 fc = new FindCharacter_2();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toUpperCase();
		String s = in.next().toUpperCase();
		System.out.println(fc.solution(str, s));

	}

}
