package baekjoon_String;

import java.util.Scanner;

public class StringPractice {

	public static void main(java.lang.String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String str;
		
		for(int i = 0; i < t; i++) {
			str = in.next();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));
		}
	}

}
