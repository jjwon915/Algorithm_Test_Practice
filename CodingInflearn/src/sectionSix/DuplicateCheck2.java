package sectionSix;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCheck2 {

	public String solution(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] == arr[i+1]) {
				return "D";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		DuplicateCheck2 T = new DuplicateCheck2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(T.solution(n, arr));
		
	}
}
