package baekjoon_AO;

import java.util.Scanner;

public class IAmACook {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int result = Integer.MIN_VALUE;
		int x;
		int ch = 0;
		
		for(int i = 1; i < 6; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				x = in.nextInt();
				sum += x;
			}
			if(sum > result) {
				result = sum;
				ch = i;
			}
		}

		System.out.println(ch + " " + result);
	}

}
