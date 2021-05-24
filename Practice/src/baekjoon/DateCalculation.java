package baekjoon;

import java.io.*;
import java.util.*;

public class DateCalculation {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String date = br.readLine();
		st = new StringTokenizer(date);
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int e = 0, s = 0, m = 0, year = 0;
		
		while(true) {
			if(e < 15) {
				e++;
			}
			else {
				e = 1;
			}
			if(s < 28) {
				s++;
			}
			else {
				s = 1;
			}
			if(m < 19) {
				m++;
			}
			else {
				m = 1;
			}
			year++;
			if(e == E && s == S && m == M)
				break;
		}
		System.out.println(year);	
	}
}
