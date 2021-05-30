package baekjoon_String;

import java.util.Arrays;
import java.util.Scanner;

public class Thirty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		long length = str.length();
		int[] count = new int[10];
		long total = 0;
		
		for(int i = 0; i < length; i++) {
			int num = Integer.parseInt(str.substring(i, i+1));
			count[num]++;
			total += num;
		}
		
		if(!str.contains("0") || total % 3 != 0) {
			System.out.println(-1);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 9; i >= 0; i--) {
			while(count[i] > 0) {
				sb.append(i);
				count[i]--;
			}
		}
		
		System.out.println(sb.toString());
	}
}
