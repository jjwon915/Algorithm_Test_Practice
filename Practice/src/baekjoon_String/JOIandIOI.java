package baekjoon_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JOIandIOI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = new char[10001];
		
		arr = str.toCharArray();
		int countJ = 0, countI = 0;
		
		for(int i = 0; i < arr.length - 2; i++) {
			switch(arr[i]) {
				case 'J':
					if(arr[i+1] == 'O' && arr[i+2] == 'I') {
						countJ++;
						break;
					}
				case 'I':
					if(arr[i+1] == 'O' && arr[i+2] == 'I') {
						countI++;
						break;
					}
			}
		}
		
		System.out.println(countJ);
		System.out.println(countI);
	}

}
