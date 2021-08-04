package sectionFive;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {

	public int solution(int n, int k) {
		
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++)
			queue.offer(i);
		
		int count = 0;
		while(queue.size() != 0) {
			int x = queue.poll();
			count++;
			if(count == k) {
				count = 0;
			}
			else {
				queue.offer(x);
			}
			if(queue.size() == 1) {
				answer = queue.poll();
				break;
			}
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		SavePrincess T = new SavePrincess();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		System.out.println(T.solution(n, k));

	}

}
