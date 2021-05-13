package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class SolveAverage {
	
	public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++) {
        	answer = answer + arr[i];
        }
        answer = answer / arr.length;
        System.out.println(answer);
        return answer;
    }

	public static void main(String[] args) {
		SolveAverage T = new SolveAverage();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Scanner in2 = new Scanner(s).useDelimiter(" ");
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(in2.hasNext()) {
			a.add(in2.nextInt());
			if(!in2.hasNext()) break;
		}
		
		int[] arr = new int[a.size()];
		
		for(int i = 0; i < a.size(); i++) {
			arr[i] = a.get(i).intValue();
		}
		
		T.solution(arr);
	}

}
