package baekjoon_String;

import java.util.Scanner;

public class Antilogarithm {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] arr = new char[s.length()];
		arr = s.toCharArray();
		
		if(arr[0] == '0' && arr[1] == 'x') {
			int sixteen = 1;
			int result = 0;
			for(int j = arr.length - 1; j > 1; j--) {
				if((int)arr[j] >= 97) {
					result = result + ((int) arr[j] - 87) * sixteen;
					sixteen *= 16;
				}
				else {
					result = result + ((int)arr[j] - '0') * sixteen;
					sixteen *= 16;
				}
			}
			System.out.print(result);
		}
		else if(arr[0] == '0') {
			int eight = 1;
			int result = 0;
			for(int j = arr.length - 1; j > 0; j--) {
				result = result + ((int)arr[j] - '0') * eight;
				eight *= 8;
			}
			System.out.print(result);
		}
		else {
			for(int j = 0; j < arr.length; j++)
				System.out.print(arr[j]);
		}
	}

}
