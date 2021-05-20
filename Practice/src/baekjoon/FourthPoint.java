package baekjoon;

import java.util.Scanner;

public class FourthPoint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[1001];
		int[] b = new int[1001];
		
		for(int i = 0; i < 3; i++) {
			int k;
			k = in.nextInt();
			a[k]++;
			k = in.nextInt();
			b[k]++;
		}
		
		int x = -1, y = -1;
		
		for(int i = 0; i < 1001; i++) {
			if(a[i] == 1) {
				x = i;
			}
			if(b[i] == 1) {
				y = i;
			}
			if(x != -1 && y != -1)
				break;
		}
		
		System.out.println(x + " " + y);
	}
}
