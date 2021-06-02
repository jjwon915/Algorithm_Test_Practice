package baekjoon_AO;

import java.util.Scanner;

public class BreakEvenPoint {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(b >= c)
			System.out.println(-1);
		else {
			System.out.println(a / (c-b) +1);
		}

	}

}
