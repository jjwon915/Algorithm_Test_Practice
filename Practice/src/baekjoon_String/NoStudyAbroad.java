package baekjoon_String;

import java.util.Arrays;
import java.util.Scanner;

public class NoStudyAbroad {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String cambridge = "CAMBRIDGE";
		char[] not = cambridge.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int ch = 0;
			for(int j = 0; j < not.length; j++) {
				if(c == not[j]) {
					ch = 1;
					break;
				}
			}
			if(ch == 0)
				sb.append(c);
		}
		
		System.out.println(sb.toString());

	}

}
