package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hashing {
	static final int r = 31;
	static final int M = 1234567891;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long answer = 0;
		
		for(int i = 0; i < L; i++) {
			answer = answer + (str.charAt(i) - 'a' + 1) * pow(r, i);
		}
		
		System.out.println(answer%M);

	}
	
	public static long pow(int a, int b) {
		return b == 0 ? 1 : a * pow(a, b - 1) % M;
	}

}
