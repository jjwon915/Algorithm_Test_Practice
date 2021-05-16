package baekjoon;

import java.util.Scanner;

public class Copyright {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int i = in.nextInt();
		
		int music = a * (i - 1) + 1;
		
		System.out.println(music);
	}
}
