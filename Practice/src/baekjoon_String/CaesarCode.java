package baekjoon_String;

import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringBuilder sb = new StringBuilder();
		int n;
		
		for(int i = 0; i < str.length(); i++) {
			n = (int)str.charAt(i) - 3;
			if(n < 65)
				n = n + 26;
			sb.append((char)n);
		}
		
		System.out.println(sb.toString());
	}
}
