package sectionFour;

import java.util.Scanner;

public class ClassLeader {

	public char solution(int n, String str) {
		
		char answer = ' ';
		int[] check = new int[5];
		
		for(int i = 0; i < n; i++) {
			if(str.charAt(i) == 'A') {
				check[0]++;
			}
			else if(str.charAt(i) == 'B') {
				check[1]++;
			}
			else if(str.charAt(i) == 'C') {
				check[2]++;
			}
			else if(str.charAt(i) == 'D') {
				check[3]++;
			}
			else if(str.charAt(i) == 'E') {
				check[4]++;
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 5; i++) {
			if(check[i] > max) {
				max = check[i];
				answer = (char) ('A' + i);
			}
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		ClassLeader T = new ClassLeader();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		
		System.out.println(T.solution(n, str));

	}

}
