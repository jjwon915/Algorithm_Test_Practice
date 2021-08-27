package sectionSeven;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphShortDistance {
	
	static int n;
	static int m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	static int[] dis;
	
	public void BFS(int v) {
		
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int current = queue.poll();
			for(int next : graph.get(current)) {
				if(ch[next] == 0) {
					ch[next] = 1;
					queue.offer(next);
					dis[next] = dis[current] + 1;
				}
			}
		}
	} 

	public static void main(String[] args) {
		
		GraphShortDistance T = new GraphShortDistance();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n + 1];
		dis = new int[n + 1];
		
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			graph.get(a).add(b);
		}
		
		T.BFS(1);
		
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
		
	}

}
