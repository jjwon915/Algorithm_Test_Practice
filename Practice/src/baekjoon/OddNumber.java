package baekjoon;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = 2147000000, sum = 0;
		
		for(int i = 0; i < 7; i++) {
			int n = in.nextInt();
			
			if(n % 2 == 1) {
				sum += n;
				if(min > n) min = n;
			}
		}
		
		if(min == 2147000000) System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}

}
