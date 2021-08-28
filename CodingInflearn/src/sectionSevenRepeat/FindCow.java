package sectionSevenRepeat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCow {
	
	static int s;
	static int e;
	static int[] distance = {1, -1, 5};
	static int[] check = new int[10001];
	
	public static int BFS() {
		
		int level = 1;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		while(!queue.isEmpty()) {
			for(int j = 0; j < queue.size(); j++) {
				if(queue.peek() == e) return level;
				int x = queue.poll();
				for(int i = 0; i < distance.length; i++) {
					if(check[x + distance[i]] == 0) {
						check[x + distance[i]] = 1;
						queue.add(x + distance[i]);
					}
				}
			}
			level++;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		s = in.nextInt();
		e = in.nextInt();
		
		System.out.println(BFS());
	}

}
