package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WeirdMultiplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		long result = 0;
		
		for(int i = 0; i < num[0].length(); i++) {
			for(int j = 0; j < num[1].length(); j++) {
				result = result + (int)(num[0].charAt(i) - '0') * (int)(num[1].charAt(j) - '0');
			}
		}
		
		System.out.println(result);
	}
}
