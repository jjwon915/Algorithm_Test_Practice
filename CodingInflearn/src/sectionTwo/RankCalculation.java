package sectionTwo;

import java.util.Scanner;

public class RankCalculation {

	public String solution(int[] arr, int n) {
		
		String answer = "";
		for(int i = 0; i < n; i++) {
			int r = n + 1;
			for(int j = 0; j < n; j++) {
				if(arr[i] >= arr[j]) r--;
			}
			answer += r + " ";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
	
		RankCalculation T = new RankCalculation();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(T.solution(arr, n));
		
	}

}
