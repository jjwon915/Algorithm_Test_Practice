package sectionSeven;

import java.util.Scanner;

public class Fibonacci2 {

	public int recursive(int n) {
		
		if(n == 1 || n == 2) return 1;
		else {
			return recursive(n - 1) + recursive(n - 2);
		}
			
		
	}
	
	public static void main(String[] args) {
		
		Fibonacci2 T = new Fibonacci2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.print(T.recursive(i) + " ");
		}
	}

}
