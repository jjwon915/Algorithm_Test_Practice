package baekjoon_String;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedWorld {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String str = in.nextLine();
			if(str.equals(".")) return;
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			for(int i = 0; i< str.length(); i++) {
				if(str.charAt(i) == '(') {
					arr.add(1);
				}
				else if(str.charAt(i) == '[') {
					arr.add(2);
				}
				else if(str.charAt(i) == ')') {
					if(arr.size() == 0) {
						arr.add(-2);
						break;
					}
					else if(arr.get(arr.size() - 1) == 1) {
						arr.remove(arr.size() - 1);
					}
					else {
						arr.add(-1);
						break;
					}
					
				}
				else if(str.charAt(i) == ']') {
					if(arr.size() == 0) {
						arr.add(-2);
						break;
					}
					else if(arr.get(arr.size() - 1) == 2) {
						arr.remove(arr.size() - 1);
					}
					else {
						arr.add(-1);
						break;
					}
				}
			}
			
			if(arr.size() == 0) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
}
