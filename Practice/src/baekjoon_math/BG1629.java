package baekjoon_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BG1629 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		long c = Integer.parseInt(st.nextToken());
		System.out.println(cal(a, b, c));
		
	}
	
	public static long cal(long a, long b, long c) {
		if(b == 0) {
			return 1;
		}
		else if(b == 1) {
			return a;
		}
		else if(b % 2 == 0) {
			long n = cal(a, b / 2, c);
			return (n * n) % c;
		}
		else {
			long n = cal(a, b / 2, c);
			return (n * n % c) * a % c;
		}
	}

}
