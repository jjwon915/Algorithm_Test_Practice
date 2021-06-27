package baekjoon_math;

import java.util.Scanner;

public class Honeycomb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 1;
		int six = 6;
		
		if(n != 1) {
			n -= 1;
			while(true) {
				count++;
				n -= six;
				if(n <= 0) 
					break;
				else
					six += 6;
			}
		}
		
		System.out.println(count);

	}

}
