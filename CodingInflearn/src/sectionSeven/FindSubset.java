package sectionSeven;

import java.util.Scanner;

public class FindSubset {
	
	public static int n;
	public static int[] ch;
	
	public void DFS(int level) {
		
		if(level == n + 1) {
			for(int i = 1; i < n + 1; i++) {
				if(ch[i] == 1)
					System.out.print(i + " ");
			}
			System.out.println();
		}
		else {
			// 왼쪽갈래
			ch[level] = 1;
			DFS(level + 1);
			// 오른쪽 갈래
			ch[level] = 0;
			DFS(level + 1);
		}
		
	}
	
	public static void main(String[] args) {
		
		FindSubset T = new FindSubset();
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		ch = new int[n + 1];
		
		T.DFS(1);
	}

}
