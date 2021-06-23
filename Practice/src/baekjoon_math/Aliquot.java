package baekjoon_math;

import java.util.Scanner;

public class Aliquot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int a;
		
		for(int i = 0; i < n; i++) {
			a = in.nextInt();
			if(a > max)
				max = a;
			if(a < min)
				min = a;
		}
		
		System.out.println(min * max);

	}

}
