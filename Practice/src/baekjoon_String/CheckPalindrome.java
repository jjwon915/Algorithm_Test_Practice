package baekjoon_String;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int p = str.length() - 1;
		int check = 1;
		
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(p)) {
				check = 0;
				p--;
				break;
			}
			else
				p--;
		}
		
		System.out.println(check);
	}

}
