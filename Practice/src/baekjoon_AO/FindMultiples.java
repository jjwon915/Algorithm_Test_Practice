package baekjoon_AO;

import java.util.Scanner;

public class FindMultiples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		while(true) {
			int a = in.nextInt();
			if(a == 0)
				break;
			if(a % n == 0)
				System.out.println(a + " is a multiple of " + n + ".");
			else
				System.out.println(a + " is NOT a multiple of " + n + ".");
		}

	}

}
