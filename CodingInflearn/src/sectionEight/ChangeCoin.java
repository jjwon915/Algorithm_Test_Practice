package sectionEight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChangeCoin {
	
	static int n;
	static Integer[] coin;
	static int much;
	static int answer = Integer.MAX_VALUE;
	
	public static void DFS(int level, int sum) {
		
		if(sum > much) return;
		if(level >= answer) return;
		if(sum == much) {
			answer = Math.min(level, answer);
		}
		else {
			for(int i = 0; i < n; i++) {
				DFS(level + 1, sum + coin[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		coin = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			coin[i] = in.nextInt();
		}
		Arrays.sort(coin, Collections.reverseOrder());

		much = in.nextInt();
		
		DFS(0, 0);
		System.out.println(answer);
	}

}
