package sectionSevenRepeat;

import java.util.Scanner;

public class FindSubset {

	static int n;
	static int[] ch;
	
	public void DFS(int level) {
		
		if(level == n + 1) {
			for(int i = 1; i <= n; i++) {
				if(ch[i] == 1) System.out.print(i + " ");
			}
			System.out.println();
		}
		else {
			ch[level] = 1;
			DFS(level + 1);
			ch[level] = 0;
			DFS(level + 1);
		}
		
	}
	
	public static void main(String[] args) {
		
		FindSubset T = new FindSubset();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		ch = new int[n+1];
		
		T.DFS(1);
	}

}
