package sectionFive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

	public String solution(String e, String h) {
		
		String answer = "NO";
		Queue<Character> q = new LinkedList<>();
		
		for(char x : h.toCharArray())
			q.offer(x);
		
		int j = 0;
		int count = e.length();
		for(int i = 0; i < h.length(); i++) {
			if(e.charAt(j) == q.peek()) {
				count--;
				q.poll();
				j++;
				if(count == 0) {
					return "YES";
				}
			}
			else
				q.poll();
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
	
		CurriculumDesign T = new CurriculumDesign();
		Scanner in = new Scanner(System.in);
		String eClass = in.next();
		String hClass = in.next();
		System.out.println(T.solution(eClass, hClass));

	}

}
