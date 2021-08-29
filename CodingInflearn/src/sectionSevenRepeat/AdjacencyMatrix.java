package sectionSevenRepeat;

import java.util.Scanner;

public class AdjacencyMatrix {

	static int n;
	static int m;
	static int[] check;
	static int[][] arr;
	static int answer = 0;
	
	public void DFS(int v) {
		
		if(v == n) answer++;
		else {
			for(int i = 1; i <= n; i++) {
				if(arr[v][i] == 1 && check[i] == 0) {
					check[i] = 1;
					DFS(i);
					check[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		AdjacencyMatrix T = new AdjacencyMatrix();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		arr = new int[n+1][n+1];
		check = new int[n+1];
		check[1] = 1;
		
		for(int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			arr[a][b] = 1;
		}

		T.DFS(1);
		
		System.out.println(answer);
		
	}

}
