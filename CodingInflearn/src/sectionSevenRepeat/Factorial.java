package sectionSevenRepeat;

import java.util.Scanner;

public class Factorial {

	public int recursive(int n) {
		if(n == 1) return 1;
		else return n * recursive(n-1);
	}
	
	public static void main(String[] args) {
		
		Factorial T = new Factorial();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		System.out.println(T.recursive(n));

	}

}
