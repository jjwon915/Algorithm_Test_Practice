package baekjoon;

import java.util.Scanner;

public class Year2007 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		int sum = 0, month = 1;
		if(x == 1) {
			sum = y;
		}
		else {
			while(month < x) {
				if(month == 2) {
					sum = sum + 28;
				}
				else if(month < 8 && (month % 2 != 0) && month != 2) {
					sum = sum + 31;
				}
				else if(month < 8 && (month % 2 == 0)) {
					sum = sum + 30;
				}
				else if(month >= 8 && (month % 2 == 0)) {
					sum = sum + 31;
				}
				else {
					sum = sum + 30;
				}
				month++;
			}
			sum = sum + y;
		}
		
		int result = sum % 7;

		switch(result) {
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 0:
				System.out.println("SUN");
				break;
		}
	}
}
