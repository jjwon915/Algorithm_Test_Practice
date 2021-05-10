package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteSmallNumber {
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        
        if(arr.length == 1) {
        	return new int[] {-1};
        }
        
        for(int tmp : arr) {
        	min = Math.min(tmp, min);
        }
        answer = new int[arr.length - 1];
        
        int j = 0;
        for(int i = 0; i < answer.length; i++) {
        	if(arr[j] == min) {
        		j++;
        		i--;
        		continue;
        	}
        	answer[i] = arr[j++];
        }
        return answer;
    }

	public static void main(String[] args) {
		DeleteSmallNumber T = new DeleteSmallNumber();
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		String line = in.nextLine();
		Scanner in2 = new Scanner(line).useDelimiter(" ");
		
		while(in2.hasNext()){
			int a = Integer.parseInt(in2.next());
			list.add(a);
			if(!in2.hasNext()) break;
		}
		
		
		int[] arr = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i).intValue();
			System.out.println(arr[i]);
		}
		
		System.out.println(T.solution(arr));
	}

}
