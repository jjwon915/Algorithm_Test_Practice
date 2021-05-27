package baekjoon_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumberOfIntegers {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count = 1;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ',') count++; 
		}
		
		System.out.println(count);
		
	}

}
