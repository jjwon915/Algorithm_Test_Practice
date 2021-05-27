package baekjoon_String;

import java.util.Scanner;

public class APlusB_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String str;
		int result;
		char[] arr = new char[10];
		
		for(int i = 0; i < t; i++) {
			str = in.next();
			arr = str.toCharArray();
			result = 0;
			for(int j = 0; j < arr.length; j++) {
				if(j == 0 || j == 2) {
					result = result + (arr[j] - '0');
				}
			}
			System.out.println(result);
		}

	}

}
