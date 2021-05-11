package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveRepeatNumbers {
	public int[] solution(int []arr) {
        int[] answer = {};
        answer = new int[arr.length];
        int i = 0, start = 0;
        int a = arr[0];
        for(i = 0; i < arr.length; i++) {
        	if(i == 0) {
        		answer[start] = a;
        		start++;
        	}
        	else if(a == arr[i]) {
        		continue;
        	}
        	else {
        		a = arr[i];
        		answer[start] = a;
        		start++;
        	}
        }
        answer = Arrays.copyOfRange(answer, 0, start);
        return answer;
    }

	public static void main(String[] args) {
		RemoveRepeatNumbers T = new RemoveRepeatNumbers();
		Scanner in = new Scanner(System.in);
		
		String a = in.nextLine();
		Scanner in2= new Scanner(a);
		List<Integer> arr = new ArrayList<Integer>();
		
		while(in2.hasNext()) {
			int num = Integer.parseInt(in2.next());
			arr.add(num);
			if(!in2.hasNext()) break;
		}
		
		int[] list = new int[arr.size()];

		for(int i = 0; i < arr.size(); i++) {
			int n = arr.get(i).intValue();
			list[i] = n;
		}
		
		System.out.println(T.solution(list));
	}

}
