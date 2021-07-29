package sectionFive;

import java.util.Scanner;
import java.util.Stack;

public class ClawCraneGame {
	
	public int solution(int[][] board, int[] moves, int n, int m) {
		
		int answer = 0;
		Stack<Integer> get = new Stack<>();
		
		for(int x : moves) {
			for(int i = 0; i < n; i++) {
				if(board[i][x-1] != 0) {
					if(!get.isEmpty()) {
						int tmp = get.pop();
						if(tmp == board[i][x-1]) {
							board[i][x-1] = 0;
							answer += 2;
							break;
						}
						get.push(tmp);
					}
					get.push(board[i][x-1]);
					board[i][x-1] = 0;
					break;
				}
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		ClawCraneGame T = new ClawCraneGame();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] board = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = in.nextInt();
			}
		}
		
		int m = in.nextInt();
		int[] moves = new int[m];
		for(int i = 0; i < m; i++) {
			moves[i] = in.nextInt();
		}

		System.out.println(T.solution(board, moves, n, m));
		
	}

}
