package baekjoon_AO;

import java.util.Scanner;

public class Plug {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += in.nextInt();
		}

		System.out.println(sum - (n - 1));
	}

}
