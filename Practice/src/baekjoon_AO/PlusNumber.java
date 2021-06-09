package baekjoon_AO;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PlusNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		StringTokenizer st = new StringTokenizer(str, ",");
		int sum = 0;
		
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum);

	}

}
