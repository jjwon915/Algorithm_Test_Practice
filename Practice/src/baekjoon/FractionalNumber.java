package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FractionalNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int count = 0;
		int i = 1;
		int u = 1, d = 1;
		
		while(true) {
			count += i;
			if(count >= X) {
				break;
			}
			i++;
		}
		
		if(i % 2 == 0) {
			for(int j = 0; j <= count - X; j++) {
				u = i - j;
				d = j + 1;
			}
		}
		else {
			for(int j = 0; j <= count - X; j++) {
				u = j + 1;
				d = i - j;
			}
		}
		
		System.out.println(u + "/" + d);
	}
}
