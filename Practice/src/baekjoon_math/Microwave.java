package baekjoon_math;

import java.util.Scanner;

public class Microwave {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		if(t % 10 != 0) {
			System.out.println(-1);
			System.exit(0);
		}
		
		int m = t / 60;
		int c = (t % 60) / 10;
		int a = m / 5;
		int b = m - a * 5;
		System.out.println(a + " " + b + " " + c);
		

	}

}
