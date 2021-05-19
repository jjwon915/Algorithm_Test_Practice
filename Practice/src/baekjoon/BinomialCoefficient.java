package baekjoon;

import java.util.Scanner;

public class BinomialCoefficient {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		
		int Nf = 1, nkf = 1, Kf = 1;
		
		for(int i = 1; i <= N; i++) {
			Nf = Nf * i;
		}
		
		for(int i = 1; i <= N-K; i++) {
			nkf = nkf * i;
		}
		
		for(int i = 1; i <= K; i++) {
			Kf = Kf * i;
		}
		
		int result = Nf/(nkf * Kf);
		
		System.out.println(result);

	}

}
