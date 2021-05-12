package baekjoon;

import java.util.Scanner;

public class PrintSame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String s = in.nextLine();
			System.out.println(s);
			if(!in.hasNext()) break;
		}
	}
}
