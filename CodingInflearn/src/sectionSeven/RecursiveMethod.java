package sectionSeven;

import java.util.Scanner;

public class RecursiveMethod {

	public void solution(int n) {
		
		if(n == 0) return;
		else {
			solution(n-1);
			System.out.print(n + " ");
		}
		
	}
	
	public static void main(String[] args) {
	
		RecursiveMethod T = new RecursiveMethod();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		T.solution(n);
		
	}

}
