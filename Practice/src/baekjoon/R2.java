package baekjoon;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r1 = in.nextInt();
		int s = in.nextInt();
		
		int r2;
		r2 = 2*s - r1;
		System.out.println(r2);
	}
}
