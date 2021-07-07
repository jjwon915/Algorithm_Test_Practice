package sectionTwo;

import java.util.Scanner;

public class TemporaryLeader {
	
	public int solution(int[][] arr, int n) {
		
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i < n + 1; i++) {
			int cnt = 0;
			for(int j = 1; j < n + 1; j++) {
				for(int k = 1; k < 6; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						// 한번이라도 같은반이기만 하면 되니까 break해준다.(같은 반을 한 학생의 수 이기 때문)
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		TemporaryLeader T = new TemporaryLeader();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n + 1][6];
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < 6; j++)
				arr[i][j] = in.nextInt();
		}

		System.out.println(T.solution(arr, n));
		
	}

}
