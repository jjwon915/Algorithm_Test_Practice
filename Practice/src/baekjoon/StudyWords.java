package baekjoon;

import java.util.Scanner;

public class StudyWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int[] a = new int[26];
		if(s.length() == 1) {
			System.out.println(s.toUpperCase());
		}
		else{
			for(char x : s.toCharArray()) {
			
				int b = (int)x;
				if(b >= 65 && b <= 90) {
					b = b - 65;
					a[b]++;
				}
				else {
					b = b - 97;
					a[b]++;
				}
			}
			int max = -1;
			char c = '!';
			for(int i = 0; i < a.length; i++) {
				if(a[i] > max) {
					max = a[i];
					c = (char)(i+65);
				}
				else if(a[i] == max) {
					c = '?';
				}
			}
			System.out.println(c);
		}

	}

}
