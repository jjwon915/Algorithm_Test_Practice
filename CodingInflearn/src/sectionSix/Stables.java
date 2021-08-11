package sectionSix;

import java.util.Arrays;
import java.util.Scanner;

public class Stables {
	
	public int count(int[] arr, int distance) {
		
		int count = 1;
		int ep = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] - ep >= distance) {
				count++;
				ep = arr[i];
			}
		}
		
		return count;
	
	}

	public int solution(int n, int c, int[] arr) {
		
		int answer = 0;
		Arrays.sort(arr);
		int rt = arr[n-1];
		int lt = 1;
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			}
			else rt = mid - 1;
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Stables T = new Stables();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int c = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.solution(n, c, arr));
		
	}

}
