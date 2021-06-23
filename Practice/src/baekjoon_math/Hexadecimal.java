package baekjoon_math;

import java.util.Scanner;

public class Hexadecimal {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int result = 0;
		int hexa = 1;
		for(int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			int a;
			if(c >= 65)
				a = c - 55;
			else
				a = c - '0';
			result += a * hexa;
			hexa = hexa * 16;
		}
		
		System.out.println(result);
	}
	
}
