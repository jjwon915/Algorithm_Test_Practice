package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BG1764 {
	
	public static void main(String[] args) throws IOException {
		HashSet<String> hs = new HashSet<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}

		ArrayList<String> result = new ArrayList<String>();
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(hs.contains(str)) {
				result.add(str);
			}
		}
		Collections.sort(result);
		
		System.out.println(result.size());
		for(String r : result) {
			System.out.println(r);
		}
	}
}
