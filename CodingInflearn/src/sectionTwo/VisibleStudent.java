package sectionTwo;

import java.util.Scanner;

public class VisibleStudent {
	
	public int solution(int[] arr) {
		
		int answer = 1;
		int tmp = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(tmp < arr[i]) {
				answer++;
				tmp = arr[i];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		VisibleStudent T = new VisibleStudent();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		String str = in.nextLine();
		int[] arr = new int[n];
		int i = 0;
		
		for(String tmp : str.split(" ")) {
			arr[i] = Integer.parseInt(tmp);
			i++;
		}
		
		System.out.println(T.solution(arr));

	}

}
