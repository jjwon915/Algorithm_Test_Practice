package sectionTwo;

import java.util.Scanner;

public class Mentoring {
	
	public int solution(int[][] arr, int n, int m) {
		
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int count = 0;
				for(int k = 0; k < m; k++) {
					int tmpA = 0;
					int tmpB = 0;
					for(int s = 0; s < n; s++) {
						if(arr[k][s] == i)
							tmpA = s;
						else if(arr[k][s] == j)
							tmpB = s;
					}
					if(tmpA < tmpB)
						count++;
				}	
				if(count == m)
					answer++;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		Mentoring T = new Mentoring();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		System.out.println(T.solution(arr, n, m));
		
	}

}
