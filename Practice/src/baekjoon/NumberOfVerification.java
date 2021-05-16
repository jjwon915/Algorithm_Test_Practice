package baekjoon;

import java.util.Scanner;

public class NumberOfVerification {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, sum = 0;
		
		for(int i = 0; i < 5; i++) {
			n = in.nextInt();
			sum = sum + n * n;
		}
		
		System.out.println(sum % 10);
	}

}
