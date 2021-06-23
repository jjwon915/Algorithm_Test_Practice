package baekjoon_math;

import java.util.Scanner;

public class FindPrimeNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p;
		int count = 0;
		boolean check;
		
		for(int i = 0; i < n; i++) {
			check = false;
			p = in.nextInt();
			if(p == 1)
				continue;
			for(int j = 2; j < p; j++) {
				if(p % j == 0){
					check = true;
					break;
				}
			}
			if(check == false)
				count++;
		}
		
		System.out.println(count);
	}
}
