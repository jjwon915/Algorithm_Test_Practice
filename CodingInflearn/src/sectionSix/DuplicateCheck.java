package sectionSix;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCheck {

	public String solution(int n, int[] arr) {
		String answer = "U";
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			if(map.get(arr[i]) == 2) {
				answer = "D";
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
		DuplicateCheck T = new DuplicateCheck();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(T.solution(n, arr));
		
	}
}
