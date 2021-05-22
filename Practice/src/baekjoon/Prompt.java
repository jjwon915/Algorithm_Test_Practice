package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompt {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		boolean check;
		for(int i = 0; i < arr[0].length(); i++) {
			check = true;
			for(int j = 0; j < n - 1; j++) {
				if(arr[j].charAt(i) != arr[j+1].charAt(i)) {
					check = false;
					break;
				}
			}
			if(check == false) {
				sb.append("?");
			}
			else {
				sb.append(arr[0].charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
