package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("-");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].charAt(0));
		}
		
	}

}
