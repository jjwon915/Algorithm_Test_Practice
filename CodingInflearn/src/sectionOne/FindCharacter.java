package sectionOne;

import java.util.Scanner;

public class FindCharacter {

	public int solution(String str, String s) {
		int result = 0;
		char c = s.charAt(0);
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c)
				result++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		FindCharacter fc = new FindCharacter();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toUpperCase();
		String s = in.next().toUpperCase();
		System.out.println(fc.solution(str, s));

	}

}
