package baekjoon_AO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterPrice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		
		int sumx, sumy;
		sumx = a * p;
		if(p <= c) sumy = b;
		else {
			p -= c;
			sumy = b + p * d;
		}
		
		if(sumx >= sumy)
			System.out.println(sumy);
		else
			System.out.println(sumx);

	}

}
