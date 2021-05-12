package baekjoon;

import java.util.Scanner;

public class Scale {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Scanner in2 = new Scanner(s);
		int a= in2.nextInt();
		int b = in2.nextInt();
		int c;
		int ch = 0;
		
		if(b > a) {
			ch = 1;
		}
		else if(a > b) {
			ch = 2;
		}
		
		while(in2.hasNext()) {
			c = in2.nextInt();
			if(c > b && ch == 1) {
				b = c;
			}
			else if(c < b && ch == 2) {
				b = c;
			}
			else {
				ch = 3; 
				break;
			}
			if(!in2.hasNext()) break;
		}
		
		if(ch == 1) System.out.println("ascending");
		else if(ch == 2) System.out.println("descending");
		else System.out.println("mixed");

	}

}
