package baekjoon_AO;

import java.util.Arrays;
import java.util.Scanner;

public class Representative {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		System.out.println(sum / 5);
		System.out.println(arr[2]);

	}

}
