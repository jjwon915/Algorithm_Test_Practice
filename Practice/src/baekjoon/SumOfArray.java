package baekjoon;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		int k = in.nextInt();
		int i, j, x, y, sum;
		for(int a = 0; a < k; a++) {
			i = in.nextInt();
			j = in.nextInt();
			x = in.nextInt();
			y = in.nextInt();
			sum = 0;
			
			for(int b = i - 1; b < x; b++) {
				for(int c = j - 1; c < y; c++) {
					sum = sum + arr[b][c];
				}
			}
			System.out.println(sum);
		}
	}
}
