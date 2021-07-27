package sectionFour;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargeNumber {

	public int solution(int[] arr, int n, int k) {
		
		int answer = -1;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int z = j + 1; z < n; z++) {
					tset.add(arr[i] + arr[j] + arr[z]);
				}
			}
		}

		int count = 0;
		for(int x : tset) {
			count++;
			if(count == k) {
				return x;
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		KthLargeNumber T = new KthLargeNumber();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.solution(arr, n, k));

	}

}
