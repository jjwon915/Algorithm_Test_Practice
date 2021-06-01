package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchDocument {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String search = br.readLine();
		
		int L = str.length();
		int sL = search.length();
		int count = 0;
		
		for(int i = 0; i <= L - sL; i++) {
			if(str.substring(i, i + sL).equals(search)) {
				i = i + sL - 1;
				count++;
			}
		}

		System.out.println(count);
	}

}
