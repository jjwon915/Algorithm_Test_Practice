package baekjoon_AO;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] wh = {1, 1, 2, 2, 2, 8};
		String[] input = in.nextLine().split(" ");
		
		for(int i = 0; i < wh.length; i++) {
			System.out.print(wh[i] - Integer.parseInt(input[i]) + " ");
			
		}
		
	}

}
