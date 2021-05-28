package baekjoon_String;

import java.util.Scanner;

public class RatingCalculation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String g = in.next();
		double result = 0;
		
		switch(g.charAt(0)) {
			case 'A':
				result = 4.0;
				break;
			case 'B':
				result = 3.0;
				break;
			case 'C':
				result = 2.0;
				break;
			case 'D':
				result = 1.0;
				break;
			case 'F':
				result = 0.0;
				System.out.println(result);
				System.exit(0);
		}
		
		switch(g.charAt(1)) {
			case '+':
				result = result + 0.3;
				break;
			case '0':
				break;
			case '-':
				result = result - 0.3;
				break;
		}
		
		System.out.println(result);

	}

}
