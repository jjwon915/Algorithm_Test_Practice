package baekjoon;

import java.util.Scanner;

public class Sangsu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int reverseA = 0, reverseB = 0;
		while(true) {
			reverseA = reverseA * 10 + a % 10;
			a = a / 10;
			if(a == 0) break;
		}
		
		while(true) {
			reverseB = reverseB * 10 + b % 10;
			b = b / 10;
			if(b == 0) break;
		}
		
		if(reverseA > reverseB)
			System.out.println(reverseA);
		else
			System.out.println(reverseB);
	}

}
