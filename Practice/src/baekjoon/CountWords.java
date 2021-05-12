package baekjoon;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		Scanner in2 = new Scanner(str).useDelimiter(" ");
		int count = 0;
		while(in2.hasNext()) {
			if(!in2.hasNext()) {
				break;
			}
			String s = in2.next();
			count++;
		}
		
		System.out.println(count);
	}

}
