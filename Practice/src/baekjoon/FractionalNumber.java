package baekjoon;

import java.util.Scanner;

public class FractionalNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int count = 0;
		int tmp;
		int T = 2;
		
		for(int i = 1; i < X; i++) {
			tmp = i;
			if(T % 2 == 0) {
				for(int j = i; j >= 1; j--) {
					tmp++;
					count++;
					if(count == X) {
						System.out.println(j+"/"+tmp);
					}
				}
			}
		}
	}

}
