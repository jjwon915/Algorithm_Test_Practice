package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yutnori {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String turn;
		int count;
		
		for(int i = 0; i < 3; i++) {
			count = 0;
			turn = br.readLine();
			st = new StringTokenizer(turn);
			while(st.hasMoreTokens()) {
				count = count + Integer.parseInt(st.nextToken());
			}
			switch(count) {
				case 0:
					System.out.println("D");
					break;
				case 1:
					System.out.println("C");
					break;
				case 2:
					System.out.println("B");
					break;
				case 3:
					System.out.println("A");
					break;
				case 4:
					System.out.println("E");
					break;
			}
		}
	}
}
