package baekjoon;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) arr[i] = 0;
			else if(i == 1) arr[i] = 1;
			else arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(arr[n]);
	}
}
