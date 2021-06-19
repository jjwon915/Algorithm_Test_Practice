package baekjoon;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
		
		for(int i = 0; i < 9; i++) {
			total = total - in.nextInt();
		}
		
		System.out.println(total);

	}

}
