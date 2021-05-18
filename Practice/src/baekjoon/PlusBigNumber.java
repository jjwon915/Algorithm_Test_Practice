package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class PlusBigNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger A = in.nextBigInteger();
		BigInteger B = in.nextBigInteger();
		
		BigInteger sum = A.add(B);
		
		System.out.println(sum);

	}

}
