package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistanceOfAlphabet {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] arr = new String[2];
		int d;
		
		for(int i = 0; i < t; i++) {
			arr = br.readLine().split(" ");
			d = 0;
			System.out.print("Distances: ");
			for(int j = 0; j < arr[0].length(); j++) {
				if(arr[1].charAt(j) >= arr[0].charAt(j)) {
					d = arr[1].charAt(j) - arr[0].charAt(j);
				}
				else {
					d = arr[1].charAt(j) + 26 - arr[0].charAt(j);
				}
				System.out.print(d + " ");
			}
			System.out.println();
		}

	}

}
