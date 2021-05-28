package baekjoon_String;

import java.util.Scanner;

public class TopSecret {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s;
		String end = "END";
		
		while(in.hasNext()) {
			s = in.nextLine();
			if(s.substring(0, 3).equals(end)) 
				break;
			sb.append(s);
			sb.reverse();
			System.out.println(sb.toString());
			sb.setLength(0);
		}
	}
}
