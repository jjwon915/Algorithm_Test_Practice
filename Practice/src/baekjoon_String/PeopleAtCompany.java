package baekjoon_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PeopleAtCompany {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashSet<String> arr = new HashSet<String>();
	
		String name;
		String state;
		
		for(int i = 0; i < n; i++) {
			name = in.next();
			state = in.next();
			if(state.equals("enter"))
				arr.add(name);
			else
				arr.remove(name);
		}
		
		List<String> array = new ArrayList<String>(arr);
		Collections.sort(array);
		ListIterator<String> it = array.listIterator(array.size());
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
