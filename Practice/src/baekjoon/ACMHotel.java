package baekjoon;

import java.util.Scanner;

public class ACMHotel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int count = 0;
		int room;
		
		for(int i = 0; i < T; i++) {
			int h = in.nextInt();
			int w = in.nextInt();
			int n = in.nextInt();
			for(int j = 1; j <= w; j++) {
				for(int k = 1; k <= h; k++) {
					count++;
					if(count == n) {
						room = k * 100 + j;
						System.out.println(room);
						count = 0;
						break;
					}
				}
				if(count == 0) break;
			}
		}

	}

}
