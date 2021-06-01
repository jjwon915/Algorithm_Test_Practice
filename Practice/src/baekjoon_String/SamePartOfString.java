package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SamePartOfString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String one = br.readLine();
		String two = br.readLine();
		
		int len1 = one.length();
		int len2 = two.length();
		int count = 0;
		int [][] map = new int[len1 + 1][len2 + 1];
		
		for(int i = 1; i <= len1; i++) {
			for(int j = 1; j <= len2; j++) {
				if(one.charAt(i-1) == two.charAt(j-1)) {
					map[i][j] = map[i-1][j-1] + 1;
					count = Math.max(count, map[i][j]);
				}
			}
		}
		
		System.out.println(count);

	}

}
