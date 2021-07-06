package sectionTwo;

import java.util.Scanner;

public class PrimeNumber {

	public int solution(int n) {
		
		int answer = 0;
		int[] ch = new int[n + 1];
		
		for(int i = 2; i < n + 1; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j = i; j < n + 1; j+=i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		PrimeNumber T = new PrimeNumber();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(T.solution(n));
		
	}

}
