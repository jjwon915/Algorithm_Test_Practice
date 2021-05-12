package baekjoon;

import java.util.Scanner;

public class DialPhone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int result = str.length();
		
		for(char x : str.toCharArray()) {
			if((int)x >= 87)
				result += 9;
			else if((int)x >= 84)
				result += 8;
			else if((int)x >= 80)
				result += 7;
			else if((int)x >= 77)
				result += 6;
			else if((int)x >= 74)
				result += 5;
			else if((int)x >= 71)
				result += 4;
			else if((int) x >= 68)
				result += 3;
			else if((int) x >= 65)
				result += 2;
		}
	
		System.out.println(result);

	}

}
