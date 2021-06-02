package baekjoon_AO;

import java.util.Scanner;

public class AITimer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int min = in.nextInt();
		int sec = in.nextInt();
		int time = in.nextInt();
		
		int ts = time % 60;
		time = time / 60;
		int tm = time % 60;
		time = time / 60;
		int th = time;
		
		sec += ts;
		if(sec >= 60) {
			tm++;
			sec %= 60;
		}
		
		min += tm;
		if(min >= 60) {
			th++;
			min %= 60;
		}
		
		hour += th;
		if(hour >= 24) {
			hour %= 24;
		}
		
		System.out.println(hour + " " + min + " " + sec);

	}

}
