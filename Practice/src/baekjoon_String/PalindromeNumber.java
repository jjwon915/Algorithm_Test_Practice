package baekjoon_String;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()) {
			String n = in.next();
			if(n.equals("0")) break;
			int d = n.length() - 1;
			int check = 0;
			for(int i = 0; i < n.length() / 2; i++) {
				if(n.charAt(i) != n.charAt(d)) {
					check = 1;
					break;
				}
				d--;
			}
			
			if(check == 1)
				System.out.println("no");
			else
				System.out.println("yes");
		}
	}
}
