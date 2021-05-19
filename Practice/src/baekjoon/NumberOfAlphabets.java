package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfAlphabets {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] alpha = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			int c = str.charAt(i) - 'a';
			alpha[c]++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			if(i != alpha.length - 1) {
				System.out.print(alpha[i] + " ");
			}
			else {
				System.out.print(alpha[i]);
			}
		}
	}
}
