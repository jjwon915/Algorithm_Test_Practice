package sectionSeven;

import java.util.Scanner;

public class RecursiveBinary {

	public static void recursive(int n) {
		
		if(n == 0) return;
		else {
			recursive(n / 2);
			System.out.print(n % 2);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		recursive(n);
	}

}
