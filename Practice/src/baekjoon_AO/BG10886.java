package baekjoon_AO;

import java.util.Scanner;

public class BG10886 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += in.nextInt();
		}
		
		if(sum < n / 2 + 1)
			System.out.println("Junhee is not cute!");
		else
			System.out.println("Junhee is cute!");
	}

}
