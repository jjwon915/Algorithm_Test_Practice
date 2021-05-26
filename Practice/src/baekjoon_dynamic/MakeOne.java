package baekjoon_dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MakeOne {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] min = new int[10000001];
		
		min[1] = 0;
		for(int i = 2; i <= n; i++) {
			min[i] = min[i-1] + 1;
			if(i % 2 == 0 && min[i/2] + 1 < min[i]) {
				min[i] = min[i/2] + 1;
			}
			if(i % 3 == 0 && min[i/3] + 1 < min[i]) {
				min[i] = min[i/3] + 1;
			}
		}
		
		System.out.println(min[n]);
	}

}
