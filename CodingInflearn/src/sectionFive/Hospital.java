package sectionFive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Hospital {	
	public int solution(int n, int m, int[] arr) {
		
		int answer = 1;
		Queue<Person> queue = new LinkedList<>();
		for(int i = 0; i < n; i++) {
			queue.offer(new Person(i, arr[i]));
		}
		while(!queue.isEmpty()) {
			Person tmp = queue.poll();
			for(Person x : queue) {
				if(x.priority > tmp.priority) {
					queue.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				if(tmp.id == m)
					return answer;
				else
					answer++;
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		Hospital T = new Hospital();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
		
	}

}
