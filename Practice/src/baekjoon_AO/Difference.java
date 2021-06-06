package baekjoon_AO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Difference {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		char[] num1 = st.nextToken().toCharArray();
		char[] num2 = st.nextToken().toCharArray();
		int a5 = 0, a6 = 0;
		int b5 = 0, b6 = 0;
		
		for(int i = 0; i < num1.length; i++) {
			if(num1[i] == '5') {
				a6 = a6 * 10 + 6;
				a5 = a5 * 10 + (int)num1[i] - '0';
			}
			else if(num1[i] == '6') {
				a5 = a5 * 10 + 5;
				a6 = a6 * 10 + (int)num1[i] - '0';
			}
			else {
				a5 = a5 * 10 + num1[i] - '0';
				a6 = a6 * 10 + num1[i] - '0';
			}
		}
		
		for(int i = 0; i < num2.length; i++) {
			if(num2[i] == '5') {
				b6 = b6 * 10 + 6;
				b5 = b5 * 10 + (int)num2[i] - '0';
			}
			else if(num2[i] == '6') {
				b5 = b5 * 10 + 5;
				b6 = b6 * 10 + (int)num2[i] - '0';
			}
			else {
				b5 = b5 * 10 + num2[i] - '0';
				b6 = b6 * 10 + num2[i] - '0';
			}
		}

		System.out.println((a5 + b5) + " " + (a6 + b6));
		
	}

}
