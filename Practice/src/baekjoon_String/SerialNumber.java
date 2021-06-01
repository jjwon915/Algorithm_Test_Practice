package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SerialNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}
		
		Collections.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					int sum1 = 0, sum2 = 0;
					for(int i = 0; i < o1.length(); i++) {
						if(o1.charAt(i) >= 48 && o1.charAt(i) <= 57) {
							sum1 += o1.charAt(i) - 48;
						}
					}
					for(int i = 0; i < o2.length(); i++) {
						if(o2.charAt(i) >= 48 && o2.charAt(i) <= 57) {
							sum2 += o2.charAt(i) - 48;
						}
					}
					if(sum1 - sum2 != 0)
						return sum1 - sum2;
					else {
						return o1.compareTo(o2);
					}
				}
				return o1.length() - o2.length();
			}
			
		});
		
		for (String str : arr) {
	        System.out.println(str);
	    }
	}

}
