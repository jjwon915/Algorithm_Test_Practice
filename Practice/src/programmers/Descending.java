package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Descending {
	public long solution(long n) {
        long answer = 0;
        String tmp = Long.toString(n);
        int a[] = new int[tmp.length()];
        for(int i = tmp.length() - 1; i >= 0; i--) {
        	a[i] = (int) (n % 10);
        	n = n / 10;
        }
        Arrays.sort(a);
        for(int i = tmp.length() - 1; i >= 0; i--) {
        	answer = answer * 10 + a[i];
        }
        return answer;
    }

	public static void main(String[] args) {
		Descending T = new Descending();
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		System.out.println(T.solution(a));
	}

}
