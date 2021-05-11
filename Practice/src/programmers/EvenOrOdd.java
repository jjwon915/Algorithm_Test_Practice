package programmers;

import java.util.Scanner;

public class EvenOrOdd {

	public String solution(int num) {
		String answer = "";
		if(num % 2 == 0)
			answer = "Even";
		else
			answer = "Odd";
		return answer;
	}
	
	public static void main(String[] args) {
		EvenOrOdd T = new EvenOrOdd();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(T.solution(n));
	}

}
