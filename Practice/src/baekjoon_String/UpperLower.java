package baekjoon_String;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a;
		
		for(int i = 0; i < s.length(); i++){
			if((int)s.charAt(i) >= 97) {
				a = (int)s.charAt(i) - 32;
				System.out.print((char)a);
			}
			else {
				a = (int)s.charAt(i) + 32;
				System.out.print((char)a);
			}
		}
	}
}
