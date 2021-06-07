package baekjoon_AO;

import java.util.Scanner;

public class IntelligentTrain_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int inP, outP;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < 10; i++) {
			outP = in.nextInt();
			inP = in.nextInt();
			sum = sum + inP - outP;
			if(sum > max)
				max = sum;
		}
		
		System.out.println(max);
	}

}
