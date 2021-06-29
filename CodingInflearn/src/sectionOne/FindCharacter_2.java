package sectionOne;

import java.util.Scanner;

public class FindCharacter_2 {

	public int solution(String str, String s) {
		int result = 0;
		char c = s.charAt(0);
		/**
		 *  향상된 for문
		 *  char x : str 이렇게 작성하면 오류 발생.
		 *  str을 char 배열로 변환해 사용해야 char x에 str의 문자를 차례대로 접근한다.
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
