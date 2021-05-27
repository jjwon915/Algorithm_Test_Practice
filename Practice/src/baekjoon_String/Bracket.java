package baekjoon_String;

import java.util.Scanner;

public class Bracket {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[] ch = new int[51];
		int sum;
		
		for(int i = 0; i < T; i++) {
			String str = in.next();
			String result = "";
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') ch[j] = -1;
				else ch[j] = 1;
			}
			sum = 0;
			for(int j = 0; j < str.length(); j++) {
				sum = sum + ch[j];
				if(sum > 0) {
					result = "NO";
					break;
				}
			}
			if(sum != 0) result = "NO";
			else result = "YES";
			
			System.out.println(result);
		}

	}

}
