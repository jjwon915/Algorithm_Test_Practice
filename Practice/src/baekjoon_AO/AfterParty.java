package baekjoon_AO;

import java.util.Scanner;

public class AfterParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int p = in.nextInt();
		in.nextLine();
		int sum = l * p;
		
		String[] str = in.nextLine().split(" ");
		for(int i = 0; i < str.length; i++) {
			System.out.print(Integer.parseInt(str[i]) - sum + " ");
		}

	}

}
