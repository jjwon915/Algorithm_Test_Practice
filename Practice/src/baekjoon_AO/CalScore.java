package baekjoon_AO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalScore {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int count = 0, s = 1;
		boolean check = false;
		
		for(int i = 0; i < n; i++) {
			if(st.nextToken().equals("1")) {
				if(check == true) {
					s++;
					count += s;
				}
				else {
					check = true;
					s = 1;
					count += s;
				}
			}
			else {
				check = false;
			}
		}
		
		System.out.println(count);

	}

}
