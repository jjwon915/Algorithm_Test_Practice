package programmers;

import java.util.Scanner;

public class AddDigits {
	
	public int solution(int n) {
        int answer = 0;
        while(true) {
        	if(n < 10) {
        		answer = answer + n;
        		break;
        	}
        	else {
        		answer = answer + n % 10;
        		n = n / 10;
        	}
        }

        return answer;
    }

	public static void main(String[] args) {
		AddDigits T = new AddDigits();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(T.solution(n));
	}

}
