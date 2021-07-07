package sectionTwo;

import java.util.Scanner;

public class MaxSumOfGrid {
	
	public int solution(int[][] arr, int n) {
		
		int answer = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				int tmpLeft = 0;
				int tmpRight = 0;
				for(int j = 0; j < n; j++) {
					tmpLeft += arr[j][j];
					tmpRight += arr[j][n-j-1];
				}
				answer = Math.max(answer, tmpLeft);
				answer = Math.max(answer, tmpRight);
			}
			int tmpR = 0;
			int tmpC = 0;
			for(int j = 0; j < n; j++) {
				tmpR += arr[i][j];
				tmpC += arr[j][i];
			}
			answer = Math.max(answer, tmpC);
			answer = Math.max(answer, tmpR);
		}
		
		return answer;

	}

	public static void main(String[] args) {
		
		MaxSumOfGrid T = new MaxSumOfGrid();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		System.out.println(T.solution(arr, n));

	}

}
