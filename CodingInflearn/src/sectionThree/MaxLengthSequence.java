package sectionThree;

import java.util.Scanner;

public class MaxLengthSequence {
	
	public int solution(int[] arr, int n, int k) {
		
		int answer = Integer.MIN_VALUE;
		int count = 0;
		int lt = 0;
		
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) count++; 

			while(count > k) {
				if(arr[lt] == 0) {
					count--;
					lt++;
					break;
				}
				lt++;
			}
			
			
			answer = Math.max(rt - lt + 1, answer);
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		MaxLengthSequence T = new MaxLengthSequence();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.solution(arr, n, k));

	}

}
