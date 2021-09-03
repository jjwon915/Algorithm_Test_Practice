package sectionEight;

import java.util.Scanner;

public class SameSumSubset {

	static int total = 0;
	static int n;
	static int[] arr;
	static boolean flag = false;
	static String answer = "NO";
	
	public static void DFS(int level, int sum) {
		if(flag == true) return;
		if(level == n) {
			if(total - sum == sum) { 
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(level + 1, sum + arr[level]);
			DFS(level + 1, sum);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			total += arr[i];
		}
		
		DFS(0, 0);
		
		System.out.println(answer);
		
	}

}
