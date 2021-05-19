package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGroupWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] count = new int[26];
		int c = 0, result = 0;
		
		for(int i = 0; i < n; i++) {
			String s = in.next();
			char[] a = s.toCharArray();
			for(int j = 0; j < a.length; j++) {
				if(a.length == 1) {
					result++;
					break;
				}
				c = (int)a[j] - 97;

				if(j == 0) count[c]++;
				else if(a[j] != a[j-1] && count[c] > 0) {
					Arrays.fill(count, 0);
					break;
				}
				else{
					if(j == a.length - 1) {
						result++;
						Arrays.fill(count, 0);
						break;
					}
					count[c]++;
				}
			}
		}
		
		System.out.println(result);
	}

}
