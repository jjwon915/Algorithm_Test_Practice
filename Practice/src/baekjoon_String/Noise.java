package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noise {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String operator = br.readLine();
		String b = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		if(operator.equals("*")) {
			sb.append(a);
			sb.append(b.substring(1));
		}
		else {
			if(a.length() > b.length()) {
				int m = a.length() - b.length();
				sb.append(a.substring(0, m));
				sb.append(b);
			}
			else if(a.length() < b.length()) {
				int m = b.length() - a.length();
				sb.append(b.substring(0, m));
				sb.append(a);
			}
			else {
				sb.append(2);
				sb.append(a.substring(1));
			}
		}
		
		System.out.println(sb.toString());
	}

}
