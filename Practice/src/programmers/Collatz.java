package programmers;

import java.util.Scanner;

public class Collatz {
	
	public int solution(int num) {
        int answer = 0;
        long a = (long) num;
        
        while(true) {
        	if(a == 1) {
        		break;
        	}
        	if(a % 2 == 0) {
        		a = a / 2;
        		answer++;
        	}
        	else if(a % 2 != 0) {
        		a = (a * 3) + 1;
        		answer++;
        	}
        	if(answer >= 500) {
        		answer = -1;
        		break;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		Collatz T = new Collatz();
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(T.solution(num));
	}

}
