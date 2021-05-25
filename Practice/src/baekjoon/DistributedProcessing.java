package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class DistributedProcessing {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int result = a % 10;
			for(int j = 1; j < b; j++) {
				result = result * a; 
				if(result > 10) {
					result = result % 10;
				}		
			}
			if(result == 0) 
				result = 10;
			System.out.println(result);
		}
	}
}
