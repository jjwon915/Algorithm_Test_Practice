package baekjoon;

import java.util.Scanner;

public class PrintStar_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i < n; i++){
			for(int j = 1; j < n-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
