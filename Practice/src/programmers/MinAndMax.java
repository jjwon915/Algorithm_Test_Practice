package programmers;

import java.util.Scanner;

public class MinAndMax {
	
	public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        Scanner in = new Scanner(s).useDelimiter(" ");
        int min = 2147000000, max = -2147000000, tmp;

        while(in.hasNext()) {
        	tmp = in.nextInt();
        	if(tmp < min)
        		min = tmp;
        	if(tmp > max)
        		max = tmp;
        }
        answer.append(min);
        answer.append(" ");
        answer.append(max);
        return answer.toString();
    }

	public static void main(String[] args) {
		MinAndMax T = new MinAndMax();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(T.solution(s));
	}
}
