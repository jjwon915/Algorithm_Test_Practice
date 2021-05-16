package baekjoon;

import java.util.Scanner;

public class PrintStar_8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i < n) {
				for(int j = 1; j < i+1; j++) {
					System.out.print("*");
				}
				for(int k = 0; k <(n-i)*2; k++) {
					System.out.print(" ");
				}
				for(int j = 1; j < i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i == n) {
				for(int j = 0; j < 2 * n; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}

		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < i*2; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
