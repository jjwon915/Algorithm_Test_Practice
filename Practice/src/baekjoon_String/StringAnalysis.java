package baekjoon_String;

import java.util.Scanner;

public class StringAnalysis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lower, upper, number, space;
		char ch;
		
		while(in.hasNext()) {
			String s = in.nextLine();
			lower = 0; 
			upper = 0; 
			number = 0;
			space = 0;
			for(int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);
				if(ch == ' ') {
					space++;
				}
				else if((int)ch >= 97) {
					lower++;
				}
				else if((int)ch >= 65 && (int)ch <= 90) {
					upper++;
				}
				else {
					number++;
				}
			}
			System.out.print(lower + " ");
			System.out.print(upper + " ");
			System.out.print(number + " ");
			System.out.println(space);
		}

	}

}
