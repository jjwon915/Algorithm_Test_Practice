package sectionEight;

import java.util.Scanner;

public class DuplicatePermutation {
	
	static int[] check;
	
	public static void DFS(int level, int n, int m) {
		if(level == m) {
			for(int x : check)
				System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i = 1; i <= n; i++) {
				check[level] = i;
				DFS(level + 1, n, m);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		check = new int[m];
		
		DFS(0, n, m);

	}

}
