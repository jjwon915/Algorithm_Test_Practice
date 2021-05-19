package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TenDayRotation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());;
		int count = 0;
		for(int i = 0; i < 5; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(n == (a % 10)) 
				count++;
		}
		System.out.println(count);
	}
}
