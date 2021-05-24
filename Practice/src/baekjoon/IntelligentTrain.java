package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class IntelligentTrain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = 0, out, in, max = -2147000000;
		
		for(int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			out = Integer.parseInt(st.nextToken());
			in = Integer.parseInt(st.nextToken());
			
			count = count - out + in;
			if(max < count) max = count;
		}
		
		System.out.println(max);
	}
}
