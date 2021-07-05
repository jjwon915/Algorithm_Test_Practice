package sectionTwo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PrintLargeNumber {

	public String solution(int n, String str) {
		
		String answer = "";
		String[] arr = str.split(" ");
		
		int tmp = Integer.parseInt(arr[0]);
		
		for(int i = 0; i < n; i++) {
			if(i == 0)
				answer += tmp + " ";
			else if(tmp < Integer.parseInt(arr[i]))
				answer += Integer.parseInt(arr[i]) + " ";
			
			tmp = Integer.parseInt(arr[i]);
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		PrintLargeNumber T = new PrintLargeNumber();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String str = in.nextLine();
		System.out.println(T.solution(n, str));

	}

}
