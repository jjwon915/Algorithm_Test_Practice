package sectionEight;

import java.util.Scanner;

public class Permutation {

	static int n;
	static int m;
	static int[] arr;
	static int[] check;
	static int[] pm;
	
	public static void DFS(int level) {
		if(level == m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = 0; i < n; i++) {
				if(check[i] == 0) {
					check[i] = 1;
					pm[level] = arr[i];
					DFS(level + 1);
					check[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n];
		check = new int[n];
		pm = new int[m];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		DFS(0);
		
	}

}
