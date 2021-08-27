package sectionSevenRepeat;

import java.util.Scanner;

public class Fibonacci {

	static int[] fibo;
	
	public int recursive(int n) {
		if(fibo[n] > 0) return fibo[n];
		if(n == 1 || n == 2) return fibo[n] = 1;
		else return fibo[n] = recursive(n-1) + recursive(n-2);
	}
	
	public static void main(String[] args) {
		
		Fibonacci T = new Fibonacci();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		fibo = new int[n + 1];
		T.recursive(n);
		
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}

	}

}
