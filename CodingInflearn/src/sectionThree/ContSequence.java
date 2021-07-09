package sectionThree;

import java.util.Scanner;

public class ContSequence {
	
	public int solution(int[] arr, int n, int m) {
		
		int answer = 0;
		int lt = 0;
		int sum = 0;
		
		for(int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				// lt 빼고 증가.
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		ContSequence T = new ContSequence();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.solution(arr, n, m));
		
	}

}
