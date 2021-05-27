package baekjoon_String;

import java.util.Scanner;

public class CorrectionTypos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int a;
		String s;
		
		for(int i = 0; i < t; i++) {
			a = in.nextInt();
			s = in.next();
			if(a == 1) {
				System.out.println(s.substring(1));
			}
			else if(a == s.length()) {
				System.out.println(s.substring(0, s.length()-1));
			}
			else {
				System.out.print(s.substring(0, a - 1));
				System.out.println(s.substring(a));
			}
		}

	}

}
