package baekjoon_String;

import java.util.Scanner;

public class Ah {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String j = in.next();
		String h = in.next();
		
		if(j.length() >= h.length()) System.out.println("go");
		else System.out.println("no");

	}

}
