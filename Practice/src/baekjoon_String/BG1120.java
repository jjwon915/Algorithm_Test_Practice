package baekjoon_String;

import java.util.Scanner;

public class BG1120 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		int len = a.length();
		
		for(int i = 0; i <= b.length() - a.length(); i++) {
			int cnt = 0;
			for(int j = 0; j < a.length(); j++) {
				if(a.charAt(j) != b.charAt(i+j))
					cnt++;
			}
			len = Math.min(len, cnt);
		}
		
		System.out.println(len);
	}
	
}
