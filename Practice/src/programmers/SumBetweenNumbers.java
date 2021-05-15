package programmers;

import java.util.Scanner;

public class SumBetweenNumbers {
	
	public long solution(int a, int b) {
        long answer = 0;
        int tmp;
        if(a > b) {
        	tmp = a;
        	a = b;
        	b = tmp;
        }

        for(int i = a; i <= b; i++) {
        	answer = answer + i;
        }
        return answer;
    }

	public static void main(String[] args) {
		SumBetweenNumbers T = new SumBetweenNumbers();
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println(T.solution(a, b));		
	}

}
