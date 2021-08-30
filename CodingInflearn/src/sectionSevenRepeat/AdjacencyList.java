package sectionSevenRepeat;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {

	static int[] check;
	static ArrayList<ArrayList<Integer>> graph;
	static int answer = 0;
	static int n, m;
	
	public static void DFS(int v) {
		
		if(v == n) answer++;
		else {
			for(int x : graph.get(v)) {
				if(check[x] == 0) {
					check[x] = 1;
					DFS(x);
					check[x] = 0;
				}
			}
		}
	
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		graph = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			graph.get(a).add(b);
		}
		
		check = new int[n+1];
		check[1] = 1;
		DFS(1);
		
		System.out.println(answer);
		
	}

}
