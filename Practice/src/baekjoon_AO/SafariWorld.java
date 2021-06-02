package baekjoon_AO;

import java.util.Scanner;

public class SafariWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long m = in.nextInt();
		long result = Math.abs(n - m);
		
		System.out.println(result);

	}

}
