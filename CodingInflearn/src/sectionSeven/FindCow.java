package sectionSeven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCow {

	int answer = 0;
	int[] distance = {1, -1, 5};
	int[] ch;
	Queue<Integer> queue = new LinkedList<>();
	
	public int BFS(int s, int e) {
		
		int answer = 0;
		ch = new int[10001];
		ch[s] = 1;
		queue.offer(s);
		int L = 0;
		while(!queue.isEmpty()) {
			int len = queue.size();
			for(int i = 0; i < len; i++) {
				int x = queue.poll();
				for(int j = 0; j < 3; j++) {
					int next = x + distance[j];
					if(next == e) return L + 1;
					if(next >= 1 && next <= 10000 && ch[next] == 0) {
						ch[next] = 1;
						queue.offer(next);
					}
				}
			}
			L++;
		}
		
		return answer;
	
	}
	
	public static void main(String[] args) {
		
		FindCow T = new FindCow();
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
		int e = in.nextInt();
		
		System.out.println(T.BFS(s, e));

	}

}
