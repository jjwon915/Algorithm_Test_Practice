package baekjoon_AO;

import java.util.Scanner;

public class OvenTimer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minute = in.nextInt();
		int set = in.nextInt();
		
		minute += set;
		int x = 0;
		boolean check = false;
		if(minute >= 60) {
			check = true;
			x = minute / 60;
			minute = minute % 60;
		}
		
		if(check == true) {
			hour += x;
			if(hour > 23) hour = hour % 24;
		}
		
		System.out.println(hour + " " + minute);
			
	}

}
