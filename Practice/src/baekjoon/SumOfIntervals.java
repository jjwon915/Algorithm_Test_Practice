package baekjoon;

import java.util.Scanner;

public class SumOfIntervals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n+1];
		arr[0] = 0;
		
		for(int i = 1; i <= n; i++) {
			arr[i] = arr[i-1] + in.nextInt();
		}
		
		for(int x = 0; x < m; x++) {
			int i = in.nextInt();
			int j = in.nextInt();
			System.out.println(arr[j] - arr[i-1]);
		}

	}

}
