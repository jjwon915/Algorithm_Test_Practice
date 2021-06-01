package baekjoon_String;

import java.util.Scanner;

public class PlaceToLieDown {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		char[][] arr = new char[101][101];
		int rowCount = 0, colCount = 0;
		int check = 0;
		char p = '.';
		
		for(int i = 0; i < n; i++) {
			String s = in.nextLine();
			for(int j = 0; j < n; j++) {
				arr[i][j] = s.charAt(j);
			}
			arr[i][n] = arr[n][i] = 'X';
		}
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n-1; j++) {
				if(arr[i][j] == '.' && arr[i][j+1] == '.' && arr[i][j+2] == 'X') 
					rowCount ++;
				if(arr[j][i] == '.' && arr[j+1][i] == '.' && arr[j+2][i] == 'X') 
					colCount ++;
			}
		}

		System.out.println(rowCount + " " + colCount);
		in.close();
	}
}
