package sectionSix;

import java.util.Scanner;

public class InsertionSort {

	public int[] solution(int n, int[] arr) {
		
		for(int i = 1; i < n; i++) {
			int tmp = arr[i];
			int j;
			for(j = i - 1; j >= 0; j--) {
				if(arr[j] > tmp) {
					arr[j+1] = arr[j];
				}
				else
					break;
			}
			arr[j+1] = tmp;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		InsertionSort T = new InsertionSort();
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
