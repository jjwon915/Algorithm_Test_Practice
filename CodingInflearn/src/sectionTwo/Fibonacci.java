package sectionTwo;

import java.util.Scanner;

public class Fibonacci {

	public String solution(int n) {
		
		String answer = "1 1 ";
		int[] arr = new int[n];
		arr[0] = arr[1] = 1;
		
		for(int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
			answer += arr[i] + " ";
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Fibonacci T = new Fibonacci();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(T.solution(n));

	}

}
