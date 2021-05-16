package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		ArrayList<Integer> arr= new ArrayList<Integer>();
		int tmp = 0, result = 0;

		for(int i = 0; i < k; i++) {
			int m = in.nextInt();
			if(m != 0) {
				arr.add(m);
				tmp++;
			}
			else {
				arr.remove(tmp-1);
				tmp--;
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			result += arr.get(i).intValue();
		}
		
		System.out.println(result);
	}

}
