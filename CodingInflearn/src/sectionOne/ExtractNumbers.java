package sectionOne;

import java.util.Scanner;

public class ExtractNumbers {

	public int solution(String str) {
		
		str = str.replaceAll("[^0-9]", "");
		int answer = Integer.parseInt(str);
		return answer;
	
	}
	
	public static void main(String[] args) {
		
		ExtractNumbers T = new ExtractNumbers();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
		
	}
	
}
