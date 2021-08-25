package sectionSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class NavigatePath2 {

	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		NavigatePath2 T = new NavigatePath2();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		
		// 객체 생성!
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		ch = new int[n+1];
		
		for(int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			// graph에 index로 접근(a를 통해서).
			graph.get(a).add(b);
		}
		
		ch[1] = 1;
		T.DFS(1);
		
		System.out.println(answer);
		
	}

}
