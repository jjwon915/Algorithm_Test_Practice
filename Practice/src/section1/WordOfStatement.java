package section1;

import java.util.Scanner;

public class WordOfStatement {
	
	public String solution(String str) {
		int count = 0, max = 0, start = 0, end = 0;
		String result = "test";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				if(count > max) {
					max = count;
					result = str.substring(start, i + 1);
				}
				count = 0;
				start = i + 1;
			}
			else if(i == str.length()-1) {
				count++;
				if(count > max) {
					max = count;
					result = str.substring(start, i + 1);
				}
			}
			else {
				count++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		WordOfStatement test = new WordOfStatement();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(test.solution(str));
	}

}
