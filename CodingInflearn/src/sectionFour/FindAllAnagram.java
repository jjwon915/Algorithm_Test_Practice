package sectionFour;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {

	public int solution(String s, String t) {
		
		int answer = 0;
		HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
		char[] charS = s.toCharArray();
		
		for(char x : t.toCharArray()) {
			mapT.put(x, mapT.getOrDefault(x, 0) + 1);
		}
		
		for(int i = 0; i < t.length() - 1; i++) {
			mapS.put(charS[i], mapS.getOrDefault(charS[i], 0) + 1);
		}
		
		int lt = 0;
		for(int rt = t.length() - 1; rt < s.length(); rt++) {
			mapS.put(charS[rt], mapS.getOrDefault(charS[rt], 0) + 1);
			if(mapS.equals(mapT))
				answer++;
			mapS.put(charS[lt], mapS.get(charS[lt]) - 1);
			if(mapS.get(charS[lt]) == 0)
				mapS.remove(charS[lt]);
			lt++;
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		FindAllAnagram T = new FindAllAnagram();
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		String t = in.next();
		
		System.out.println(T.solution(s, t));

	}

}
