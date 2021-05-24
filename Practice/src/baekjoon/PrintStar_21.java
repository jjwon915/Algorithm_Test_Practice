package baekjoon;

import java.util.Scanner;

public class PrintStar_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = n / 2 + n % 2;
		int b = n / 2;
		int count = 0;
		
		while(true) {
			for(int i = 1; i <= a; i++) {
				if(i == a) {
					System.out.print("*");
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
			for(int i = 1; i <= b; i++) {
				System.out.print(" *");
			}
			System.out.println();
			count++;
			if(count == n) 
				break;
		}
	}
}
