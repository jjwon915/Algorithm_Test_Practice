package programmers;

import java.util.Scanner;

public class NumbersWithGap {
	
	public long[] solution(int x, int n) {
		long[] answer = {};
		answer = new long[n];
		long a = x;
		for(int i = 0; i < n; i++) {
			answer[i] = a;
			a += x;
		}
		return answer;
	}

	public static void main(String[] args) {
		NumbersWithGap T = new NumbersWithGap();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int n = in.nextInt();
		System.out.println(T.solution(x, n));
	}

}
