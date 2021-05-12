package baekjoon;

import java.util.Scanner;

public class PrintSplit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] a = str.toCharArray();
		int i = 0;
		while(true) {
			if(i + 9 < a.length) {
				System.out.println(str.substring(i, i + 10));
				i = i + 10;
			}
			else {
				System.out.println(str.substring(i));
				break;
			}
		}

	}

}
