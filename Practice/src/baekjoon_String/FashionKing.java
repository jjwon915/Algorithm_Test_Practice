package baekjoon_String;

import java.util.HashMap;
import java.util.Scanner;

public class FashionKing {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		HashMap<String, Integer> clothes = new HashMap<String, Integer>();
		
		while(t --> 0) {
			int n = in.nextInt();
			for(int i = 0; i < n; i++) {
				in.next();
				String c = in.next();
	
				if(clothes.containsKey(c)) {
					clothes.put(c, clothes.get(c) + 1);
				}
				else {
					clothes.put(c, 1);
				}
			}
			int answer = 1;
			
			for(int i : clothes.values()) {
				answer *= i + 1;
			}

			System.out.println(answer - 1);
			clothes.clear();
		}
		
	}

}
