package sectionSix;

import java.util.Scanner;

public class SelectionSort {

	public int[] solution(int n, int[] arr) {
		
		for(int i = 0; i < n; i++) {
			int idx = i;
			for(int j = i + 1; j < n; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = tmp;
		}
		
		return arr;
	
	}
	
	public static void main(String[] args) {
		
		SelectionSort T = new SelectionSort();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}

}
