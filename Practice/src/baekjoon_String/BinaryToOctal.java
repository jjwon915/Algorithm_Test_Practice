package baekjoon_String;

import java.util.Scanner;

public class BinaryToOctal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringBuilder sb = new StringBuilder();
		int length = s.length();
		
		if(length % 3 == 2) {
			int a = Integer.parseInt(s.substring(0, 1));
			int b = Integer.parseInt(s.substring(1, 2));
			s = s.substring(2);
			int sum = 0;
			sum = a * 2 + b * 1;
			sb.append(sum);
		}
		else if(length % 3 == 1) {
			int a = Integer.parseInt(s.substring(0, 1));
			s = s.substring(1);
			int sum = 0;
			sum = a * 1;
			sb.append(sum);
		}
		int i = 0, a, b, c, sum;
		while(true) {
			if(i >= s.length()) break;
			a = Integer.parseInt(s.substring(i, i+1));
			b = Integer.parseInt(s.substring(i+1, i+2));
			c = Integer.parseInt(s.substring(i+2, i+3));
			sum = a * 4 + b * 2 + c * 1;
			sb.append(sum);
			i += 3;
		}

		System.out.println(sb.toString());
	}
}
