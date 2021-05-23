package baekjoon;

import java.util.Scanner;

public class MultipleFactor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 100000, b = 100000;
		while(true) {
			a = in.nextInt();
			b = in.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			if(b % a == 0) {
				System.out.println("factor");
			}
			else if(a % b == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
			
		}
	}

}
