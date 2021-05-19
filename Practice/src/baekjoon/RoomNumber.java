package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class RoomNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num[] = new int[10];
		int count = 1, m = -1;
		
		while(true) {
			int x = n % 10;
			n = n / 10;
			num[x]++;
			if(n == 0)
				break;
		}
		
		int k = num[6] + num[9];
		num[6] = k / 2 + k % 2;
		num[9] = k / 2 + k % 2;
		
		for(int i : num) {
			m = Math.max(i, m);
		}
		
		System.out.println(m);
	}
}
