package sectionOne;

import java.util.Scanner;

public class FindCharacter_2 {

	public int solution(String str, String s) {
		int result = 0;
		char c = s.charAt(0);
		/**
		 *  ���� for��
		 *  char x : str�� ���� �ȵȴ�.
		 *  str�� �迭�� ��ȯ�ؾ�  ��밡��.
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
