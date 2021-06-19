package baekjoon;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {

	public static void main(String[] args) {
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String time1 = f1.format(time);
		System.out.println(time1);
	}
}
