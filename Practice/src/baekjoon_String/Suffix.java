package baekjoon_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Suffix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		ArrayList<String> a = new ArrayList<String>();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			a.add(str.substring(i));
		}
		
		Collections.sort(a);
		
		for(String s : a) {
			System.out.println(s);
		}
	}
}
