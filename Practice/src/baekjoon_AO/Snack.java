package baekjoon_AO;

import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		
		int result = k * n - m;
		if(result < 0) result = 0;
		
		System.out.println(result);

	}

}
