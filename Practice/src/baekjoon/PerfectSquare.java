package baekjoon;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int N = in.nextInt();
		int sum = 0;
		int minsquare = 0;
		
		for(int i = 1; i <= 100; i++) {
			int square = i * i;
			if(square <= N && square >= M) {
				if(sum == 0) {
					minsquare = square;
				}
				sum = sum + square;
			}
			if(square > N)
				break;
		}
		
		if(sum == 0) {
			System.out.println("-1");
			System.exit(0);
		}
		System.out.println(sum);
		System.out.println(minsquare);
	}

}
