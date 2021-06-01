package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Resistance {

	public static void main(String[] args) throws IOException {
		
		String[] res = {"black", "brown", "red", "orange", 
				"yellow","green", "blue", "violet", 
				"grey", "white"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long answer = 0L;
		String tmp = "";
	
		for(int i = 0; i < 3; i++) {
			String s = br.readLine();
			
			if(i == 2) {
				answer = (long) ((Long.parseLong(tmp)) * Math.pow(10, Arrays.asList(res).indexOf(s)));
			}
			else {
				tmp += Arrays.asList(res).indexOf(s);
			}
		}
		
		System.out.println(answer);
		
	}

}

