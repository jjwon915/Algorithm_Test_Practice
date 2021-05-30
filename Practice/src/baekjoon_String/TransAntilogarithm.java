package baekjoon_String;

import java.util.Scanner;

public class TransAntilogarithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		int[] arr = new int[n.length()];
		int b = in.nextInt();
		char digit;
		int result = 0;
		int mul = 1;
		
		for(int i = n.length() - 1; i >= 0; i--) {
			digit = n.charAt(i);
			int x = (int)digit;
			if((int)digit >= 65) {
				x = x - 55;
			}
			else {
				x = x - 48;
			}
			x = x * mul;
			mul = mul * b;
			result = result + x;
		}
		System.out.println(result);
	}

}
