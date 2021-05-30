package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROT13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c;
		
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			int x = (int)c;
			
			if(x >= 97) {
				x = x + 13;
				if(x > 122) {
					x = x - 26;
				}
				System.out.print((char)x);
			}
			else if(x >= 65) {
				x = x + 13;
				if(x > 90) {
					x = x - 26;
				}
				System.out.print((char)x);
			}
			else {
				System.out.print(c);
			}
		}

	}

}
