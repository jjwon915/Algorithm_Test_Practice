package baekjoon_AO;

import java.util.Scanner;

public class BuyCar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int q, p;
		
		for(int i = 0; i < t; i++) {
			int s = in.nextInt();
			int n = in.nextInt();
			int sum = s;
			for(int j = 0; j < n; j++) {
				q = in.nextInt();
				p = in.nextInt();
				sum += q * p;
			}
			System.out.println(sum);
		}

	}

}
