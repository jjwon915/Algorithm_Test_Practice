package sectionFour;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

	public String solution(String str1, String str2) {
		
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : str1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char z : str2.toCharArray()) {
			if(map.containsKey(z) == false || map.get(z) == 0)
				return "NO";
			map.put(z, map.get(z) - 1);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Anagram T = new Anagram();
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		
		System.out.println(T.solution(str1, str2));

	}

}
