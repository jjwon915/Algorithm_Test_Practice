package baekjoon;

import java.util.Scanner;

public class PrintStar_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < 2 * n - i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
