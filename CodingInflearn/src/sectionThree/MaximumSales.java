package sectionThree;

import java.util.Scanner;

public class MaximumSales {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int answer = Integer.MIN_VALUE;
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] arr = new int[n];
		int tmp = 0;
		int p1 = 0;
		
 		for(int i = 0; i < n; i++) {
 			arr[i] = in.nextInt();
 			tmp += arr[i];
 			p1++;
 			if(p1 == k) {
 				if(answer < tmp) {
 					answer = tmp;
 				}
 				p1--;
 				tmp -= arr[i-k+1];
 			}
		}
 		
 		System.out.println(answer);
		
	}

}
