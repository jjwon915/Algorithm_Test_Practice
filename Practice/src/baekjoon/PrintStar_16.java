package baekjoon;

import java.util.Scanner;

public class PrintStar_16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				if(j == i - 1) {
					System.out.print("*");
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
