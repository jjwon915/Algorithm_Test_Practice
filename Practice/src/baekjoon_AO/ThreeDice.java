package baekjoon_AO;

import java.util.Scanner;

public class ThreeDice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			arr[i] = in.nextInt();
			if(arr[i] > max)
				max = arr[i];
		}
		int result = 0;
		
		if(arr[0] == arr[1] && arr[1] == arr[2]) {
			result = 10000 + arr[0] * 1000;
			System.out.println(result);
		}
		else if(arr[0] == arr[1] || arr[1] == arr[2]) {
			result = 1000 + arr[1] * 100;
			System.out.println(result);
		}
		else if(arr[2] == arr[0]) {
			result = 1000 + arr[2] * 100;
			System.out.println(result);
		}
		else {
			result = max * 100;
			System.out.println(result);
		}

	}

}
