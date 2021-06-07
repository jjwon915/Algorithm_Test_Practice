package baekjoon_AO;

import java.util.Scanner;

public class Happiness {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			if(a < min)
				min = a;
			if(a > max)
				max = a;
		}
		
		System.out.println(max - min);

	}

}
