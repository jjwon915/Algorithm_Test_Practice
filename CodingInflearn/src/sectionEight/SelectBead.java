package sectionEight;

import java.util.Scanner;

public class SelectBead {

	static int n;
	static int m;
	static int[] combi;
	
	public void DFS(int level, int start) {
		if(level == m) {
			for(int x : combi) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = start; i <= n; i++) {
				combi[level] = i;
				DFS(level + 1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		SelectBead T = new SelectBead();
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		m = in.nextInt();
		combi = new int[m];
		
		T.DFS(0, 1);
		
	}

}
