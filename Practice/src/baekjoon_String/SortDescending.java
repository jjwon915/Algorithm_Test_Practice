package baekjoon_String;

import java.util.ArrayList;
import java.util.Scanner;

public class SortDescending {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int tmp;
		
		while(true) {
			tmp = n % 10;
			n = n / 10;
			arr.add(tmp);
			if(n == 0)
				break;
		}
		
		int[] a = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			a[i] = arr.get(i);
		}
		
		int ch;
		for(int i = 0; i < a.length; i++) {
			ch = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[j] > a[ch])
					ch = j;
			}
			tmp = a[i];
			a[i] = a[ch];
			a[ch] = tmp;
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

}
