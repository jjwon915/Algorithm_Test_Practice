package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppearOfSMUPC {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			int x = (int) s.charAt(i);
			int sum = 0;
			while(true) {
				sum = sum + x % 10;
				x = x / 10;
				if(x == 0)
					break;
			}
			for(int j = 0; j < sum; j++) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}

	}
}
