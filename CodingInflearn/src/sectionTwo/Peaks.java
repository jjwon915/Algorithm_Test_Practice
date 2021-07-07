package sectionTwo;

import java.util.Scanner;

public class Peaks {

	public int solution(int[][] arr, int n) {
		
		int answer = 0;
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				int tmp = arr[i][j];
				if(tmp <= arr[i][j - 1])
					continue;
				else if(tmp <= arr[i][j + 1])
					continue;
				else if(tmp <= arr[i - 1][j])
					continue;
				else if(tmp <= arr[i + 1][j])
					continue;
				else
					answer++;
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Peaks T = new Peaks();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n+2][n+2];
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++)
				arr[i][j] = in.nextInt();
		}

		System.out.println(T.solution(arr, n));
		
	}

}
