package sectionSix;

import java.util.Scanner;

public class LRU {
	
	public int[] solution(int s, int n, int[] arr) {
		
		int[] answer = new int[s];
		
		for(int i = 0; i < n; i++) {
			int pos = -1;
			for(int j = 0; j < s; j++) {
				if(arr[i] == answer[j])
					pos = j;
			}
			if(pos == -1) {
				for(int j = s - 1; j >= 1; j--) {
					answer[j] = answer[j-1];
				}
			}
			else {
				for(int j = pos; j >= 1; j--) {
					answer[j] = answer[j-1];
				}
			}
			answer[0] = arr[i];
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		LRU T = new LRU();
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int x : T.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
	}
}
