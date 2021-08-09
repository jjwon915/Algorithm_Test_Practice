package sectionSix;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
	
	public int check(int[] arr, int capacity) {
		
		int count = 1;
		int sum = 0;
		
		for(int x : arr) {
			if(sum + x > capacity) {
				count++;
				sum = x;
			}
			else
				sum += x;
		}
		
		return count;
		
	}
	
	public int solution(int n, int m, int[] arr) {
		
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(check(arr, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}
			else lt = mid + 1;
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		MusicVideo T = new MusicVideo();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int max = -1;
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
		
	}

}
