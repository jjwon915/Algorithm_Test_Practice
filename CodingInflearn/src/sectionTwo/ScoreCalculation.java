package sectionTwo;

import java.util.Scanner;

public class ScoreCalculation {
	
	public int solution(int[] arr, int n) {
		
		int answer = 0;
		int s = 0;
		boolean p = false;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 1 && p == false) {
				s = 1;
				answer += s;
				p = true;
			}
			else if(arr[i] == 1 && p == true) {
				s++;
				answer += s;
			}
			else {
				s = 0;
				p = false;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		ScoreCalculation T = new ScoreCalculation();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(T.solution(arr, n));
		
	}

}
