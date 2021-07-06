package sectionTwo;

import java.util.Scanner;

public class RSP {
	
	public char[] solution(int[][] arr, int n) {
		
		char[] answer = new char[n];
		
		for(int i = 0; i < n; i++) {
			if(arr[0][i] == arr[1][i]) {
				answer[i] = 'D';
			}
			else if(arr[0][i] == 1 && arr[1][i] == 3) {
				answer[i] = 'A';
			}
			else if(arr[0][i] == 2 && arr[1][i] == 1) {
				answer[i] = 'A';
			}
			else if(arr[0][i] == 3 && arr[1][i] == 2) {
				answer[i] = 'A';
			}
			else {
				answer[i] = 'B';
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		RSP T = new RSP();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[2][n];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		for(char x : T.solution(arr, n)) {
			System.out.println(x);
		}

	}

}
