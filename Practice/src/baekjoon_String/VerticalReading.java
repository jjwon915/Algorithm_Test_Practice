package baekjoon_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class VerticalReading {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		char[][] arr = new char[5][15];
		
		for(int i = 0; i < 5; i++) {
			s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] == ' ' || arr[j][i] == '\0') continue;
				System.out.print(arr[j][i]);
			}
		}
	}
}