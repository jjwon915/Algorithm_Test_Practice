package baekjoon_math;

import java.util.Scanner;

public class BG1929 {
	
	public static boolean[] prime;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		prime = new boolean[n + 1];
		getPrime();
		
		for(int i = m; i <= n; i++) {
			if(!prime[i])
				System.out.println(i);
		}
		

	}
	
	public static void getPrime() {
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j+= i) {
				prime[j] = true;
			}
		}
	}

}
