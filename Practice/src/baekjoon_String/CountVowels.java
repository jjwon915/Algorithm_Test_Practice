package baekjoon_String;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if(x == 97 || x == 101 || x == 105 || x == 111 || x == 117)
				sum++;
		}
		
		System.out.println(sum);
	}
}
