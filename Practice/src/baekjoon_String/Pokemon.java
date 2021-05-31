package baekjoon_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pokemon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		HashMap<String, Integer> pokemon = new HashMap<String, Integer>();
		String[] name = new String[n+1];
		in.nextLine();
		for(int i = 1; i <= n; i++) {
			String a = in.nextLine();
			pokemon.put(a, i);
			name[i] = a;
		}
		
		for(int i = 0; i < m; i++) {
			String input = in.nextLine();
			if(Character.isDigit(input.charAt(0)) == true) {
				int index = Integer.parseInt(input);
				System.out.println(name[index]);
			}
			else {
				System.out.println(pokemon.get(input));
			}
		}
		
	}

}
