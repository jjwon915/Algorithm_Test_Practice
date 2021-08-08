package sectionSix;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public int solution(int n, int m, int[] arr) {
		
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0;
		int rt = n - 1;
		
		while(lt <= rt) {
			int x = (lt + rt) / 2;
			if(arr[x] == m) {
				answer = x + 1;
				break;
			}
			else if(arr[x] < m) {
				lt = x + 1;
			}
			else {
				rt = x - 1;
			}
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		BinarySearch T = new BinarySearch();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(T.solution(n, m, arr));
		
	}

}
