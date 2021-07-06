package sectionTwo;

import java.util.Scanner;

public class ReversePrime {

	public String solution(String[] arr, int n) {
		
		String answer = "";
		
		for(String a : arr) {
			String tmp = new StringBuilder(a).reverse().toString();
			int x = Integer.parseInt(tmp);
			int[] t = new int[x+1];
			for(int j = 2; j < x + 1; j++) {
				if(t[j] == 0) {
					if(j == x)
						answer += x + " ";
					t[j]++;
					for(int k = j; k < x + 1; k += j)
						t[k]++;
				}
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		ReversePrime T = new ReversePrime();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] arr = in.nextLine().split(" ");
		System.out.println(T.solution(arr, n));

	}

}
