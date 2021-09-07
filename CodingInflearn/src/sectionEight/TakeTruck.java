package sectionEight;

import java.util.Scanner;

public class TakeTruck {

	static int c;
	static int n;
	static int[] w;
	static int answer = 0;
	
	public static void DFS(int level, int sum) {
		if(level == n) {
			if(sum >= answer && sum <= c)
				answer = sum;
			return;
		}
		else {
			DFS(level + 1, sum + w[level]);
			DFS(level + 1, sum);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		c = in.nextInt();
		n = in.nextInt();
		w = new int[n];
		
		for(int i = 0; i < n; i++) {
			w[i] = in.nextInt();
		}
		
		DFS(0, 0);
		System.out.println(answer);
		
	}

}
