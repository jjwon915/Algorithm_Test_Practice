package baekjoon_String;

import java.util.Scanner;

public class InvertedAddition {
	
	public int Rev(int input) {
		int result = 0;
		while(input != 0) {
			result = result * 10 + input % 10;
			input = input / 10;
		}
		
		return result;
	}

	public static void main(String[] args) {
		InvertedAddition T = new InvertedAddition(); 
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.println(T.Rev((T.Rev(x) + T.Rev(y))));

	}
}
