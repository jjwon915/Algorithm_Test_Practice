package baekjoon;

import java.util.Scanner;

public class RepeatCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int r = in.nextInt();
			String S = in.next();
			for(char x : S.toCharArray()) {
				for(int j = 0; j < r; j++) {
					System.out.print(x);
				}
			}
			System.out.println();
		}

	}

}
