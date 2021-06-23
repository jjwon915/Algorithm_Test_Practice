package baekjoon_math;

import java.util.Scanner;

public class IntoPrimes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int into = 2;
		while(true) {
			if(n == 1)
				break;
			if(n % into == 0) {
				System.out.println(into);
				n = n / into;
			}
			else
				into++;
		}

	}

}
