package sectionEight;

import java.util.Scanner;

public class Combinations {

	public static int[][] arr;
	public static int DFS(int n, int r) {
		if(r == 0 || n == r) return 1;
		if(arr[n][r] != 0) return arr[n][r];
		else {
			return arr[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		arr = new int[n+1][n+1];
		
		System.out.println(DFS(n, r));
	}

}
