package sectionEight;

import java.util.Scanner;

public class SameSumSubset2 {

	static int n;
	static int[] arr;
	static int sum = 0;
	static boolean check = false;
	static String answer = "NO";
	
	public static void DFS(int level, int total) {
		if(answer == "YES") return;
		if(level == n) {
			if(total == sum - total) {
				check = true;
				answer = "YES";
				return;
			}
		}
		else {
			DFS(level + 1, total + arr[level]);
			DFS(level + 1, total);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		DFS(0, 0);
		System.out.println(answer);
		
	}

}
