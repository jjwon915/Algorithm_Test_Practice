package baekjoon;

import java.util.Scanner;

public class PrintStar_12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 1; i<= n * 2- 1; i++) {
			for(int j = Math.abs(n-i); j > 0; j--) {
				System.out.print(" ");
			}
			if(i <= n) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
			}
			else if(i > n) {
				for(int j = 0; j < n - (i - n); j++) {
					System.out.print("*");
				}
			}
		
			System.out.println();
			
		}

	}

}
