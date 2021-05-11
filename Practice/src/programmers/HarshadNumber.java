package programmers;

import java.util.Scanner;

public class HarshadNumber {
	
	public boolean solution(int x) {
		boolean answer = true;
		int a = 0, tmp = x;
		while(true) {
			a += tmp % 10;
			tmp = tmp / 10;
			if(tmp == 0) {
				break;
			}
		}
		if(x % a == 0) {
			return answer;
		}
		else {
			answer = false;
		}
		return answer;
	}

	public static void main(String[] args) {
		HarshadNumber T = new HarshadNumber();
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println(T.solution(x));
	}

}
