package baekjoon_AO;

import java.util.Scanner;

public class VacationHomework {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int korean = in.nextInt();
		int math = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();
		int max;
		if(math % m != 0)
			max = math / m + 1;
		else
			max = math / m;
		
		if(korean % k != 0)
			max = Math.max(max, korean / k + 1);
		else
			max = Math.max(max, korean / k);
		
		System.out.println(l - max);

	}

}
