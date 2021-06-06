package baekjoon_AO;

import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sumY = 0, a;
		int sumM = 0;
		
		for(int i = 0; i < n; i++) {
			int p = in.nextInt();
			sumY += ((p / 30) + 1) * 10;
			sumM += ((p / 60) + 1) * 15;
		}
		
		if(sumY == sumM) System.out.println("Y M " + sumY);
		else if(sumY > sumM) System.out.println("M " + sumM);
		else System.out.println("Y " + sumY);
		
	}

}
