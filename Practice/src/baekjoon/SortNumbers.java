package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
 		for(int i = 0; i < n; i++) {
 			a[i] = in.nextInt();
 		}
 		
 		Arrays.sort(a);
 		for(int i = 0; i < n; i++) {
 			System.out.println(a[i]);
 		}
	}

}
