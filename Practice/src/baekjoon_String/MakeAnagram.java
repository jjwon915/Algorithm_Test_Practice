package baekjoon_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MakeAnagram {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = new int[26];
		int[] b = new int[26];
		
		String input1 = br.readLine();
		String input2 = br.readLine();
		int x;
		
		for(int i = 0; i < input1.length(); i++) {
			x = (int)(input1.charAt(i) - 'a');
			a[x]++;
		}
		
		for(int i = 0; i < input2.length(); i++) {
			x = (int)(input2.charAt(i) - 'a');
			b[x]++;
		}
		
		int result = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				result = result + Math.abs(a[i] - b[i]);
		}
		
		System.out.println(result);

	}

}
