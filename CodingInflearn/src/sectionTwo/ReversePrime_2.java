package sectionTwo;

import java.util.Scanner;

public class ReversePrime_2 {

	public String solution(String[] arr, int n) {
		
		String answer = "";
		
		for(String a : arr) {
			String tmp = new StringBuilder(a).reverse().toString();
			int x = Integer.parseInt(tmp);
			boolean check = false;
			
			if(x == 1) continue;
			
			for(int i = 2; i < x; i++) {
				if(x % i == 0) {
					check = true;
					break;
				}
			}
			if(check == false) answer += x + " ";
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		ReversePrime_2 T = new ReversePrime_2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] arr = in.nextLine().split(" ");
		System.out.println(T.solution(arr, n));

	}

}
