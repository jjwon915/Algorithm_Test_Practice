package baekjoon_AO;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			String k = in.next();
			if((int)k.charAt(k.length()-1) % 2 == 0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
	}

}
