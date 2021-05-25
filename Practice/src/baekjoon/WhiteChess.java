package baekjoon;

import java.io.*;

public class WhiteChess {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int count = 0, line;
		
		for(line = 1; line < 9; line++) {
			str = br.readLine();
			if(line % 2 == 1) {
				for(int j = 0; j < str.length(); j++) {
					if(j % 2 == 0 && str.charAt(j) == 'F')
						count++;
				}
			}
			else {
				for(int j = 0; j < str.length(); j++) {
					if(j % 2 == 1 && str.charAt(j) == 'F')
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
