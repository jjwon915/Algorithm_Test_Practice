package sectionSevenRepeat;

import java.util.Scanner;

public class BinaryPrintRecursive {

	public void recursive(int n) {
		
		if(n == 0) return;
		else {
			recursive(n / 2);
			System.out.print(n % 2);
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryPrintRecursive T = new BinaryPrintRecursive();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		T.recursive(n);

	}

}
