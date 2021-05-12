package baekjoon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n == 0) {
			System.out.println("1");
			System.exit(0);
		}
		
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}

		System.out.println(result);
	}

}
