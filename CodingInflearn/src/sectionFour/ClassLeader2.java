package sectionFour;

import java.util.HashMap;
import java.util.Scanner;

public class ClassLeader2 {

	public char solution(int n, String str) {
		
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		System.out.println(map.containsKey('A'));
		System.out.println(map.size());
		System.out.println(map.remove('A'));
		System.out.println(map.size());
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			if(map.getOrDefault(key, 0) > max) {
				answer = key;
				max = map.getOrDefault(key, 0);
			}
		}
		
		return answer;
		
	}
	public static void main(String[] args) {
		
		ClassLeader2 T = new ClassLeader2();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String str = in.next();
		
		System.out.println(T.solution(n, str));

	}

}
