package baekjoon_AO;

import java.util.Scanner;

public class Apple {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int result = 0;
		for(int i = 0; i < n; i++) {
			int st = in.nextInt();
			int ap = in.nextInt();
			result += ap % st;
		}
		
		System.out.println(result);

	}

}
