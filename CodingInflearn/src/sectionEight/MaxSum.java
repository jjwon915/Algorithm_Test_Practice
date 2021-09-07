package sectionEight;

import java.util.Scanner;

public class MaxSum {
	
	static int n;
	static int m;
	static int[] point;
	static int[] time;
	static int answer = Integer.MIN_VALUE;

	public static void DFS(int level, int score, int t) {
		if(t > m) return;
		if(level == n) {
			if(score >= answer && t <= m) {
				answer = score;
			}
			return;
		}
		else {
			DFS(level + 1, score + point[level], t + time[level]);
			DFS(level + 1, score, t);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		point = new int[n];
		time = new int[n];
		
		for(int i = 0; i < n; i++) {
			point[i] = in.nextInt();
			time[i] = in.nextInt();
		}
		
		DFS(0, 0, 0);
		
		System.out.println(answer);
	}

}
