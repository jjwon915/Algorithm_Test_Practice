package baekjoon_AO;

import java.util.Scanner;

public class OddSymbol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		long sumab = a + b;
		long subab = a - b;
		long result = sumab * subab;
		
		System.out.println(result);

	}

}
