package baekjoon_String;

import java.util.Scanner;

public class OctalToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringBuilder sb = new StringBuilder();
		String[] binary = {"000", "001", "010", "011", "100", "101", "110", "111"};
		int d;
		
		for(int i = 0; i < s.length(); i++) {
			d = (int)s.charAt(i) - '0';
			sb.append(binary[d]);
		}
		if(sb.charAt(0) == '0') {
			if(sb.charAt(1) == '0') System.out.println(sb.substring(2).toString());
			else System.out.println(sb.substring(1).toString());
		}
		else {
			System.out.println(sb.toString());
		}
	}
}
