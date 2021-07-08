package sectionTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
	
	public ArrayList<Integer> solution(int[] arr, int[] arr2, int n, int m){
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		int p1 = 0, p2 = 0;
		
		while(p1 < n && p2 < m) {
			int tmp1 = arr[p1];
			int tmp2 = arr2[p2];
			if(tmp1 == tmp2) {
				answer.add(tmp1);
				p1++;
				p2++;
			}
			else if(tmp1 < tmp2) {
				p1++;
			}
			else if(tmp2 < tmp1) {
				p2++;
			}
			else {
				p1++;
				p2++;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		Intersection T = new Intersection();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int m = in.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i++) {
			arr2[i] = in.nextInt();
		}

		for(int x : T.solution(arr, arr2, n, m)) {
			System.out.print(x + " ");
		}
	}

}
