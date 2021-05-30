package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasketBall {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] alphabet = new int[26];
		String firstname;
		
		for(int i = 0; i < n; i++) {
			firstname = br.readLine();
			alphabet[firstname.charAt(0) - 'a']++;
		}
	
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			if(alphabet[i] >= 5)
				result.append((char)(i+97));
		}
		
		if(result.length()==0) System.out.println("PREDAJA");
		else System.out.println(result.toString());
	}
}
