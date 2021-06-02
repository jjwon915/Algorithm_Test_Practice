package baekjoon_AO;

import java.util.Scanner;

public class BG5543 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hamburger = Integer.MAX_VALUE;
		int x;
		
		for(int i = 0; i < 3; i++) {
			x = in.nextInt();
			if(x < hamburger)
				hamburger = x;
		}
		
		int cola = in.nextInt();
		int sprite = in.nextInt();
		
		if(cola <= sprite) 
			System.out.println(hamburger + cola - 50);
		else
			System.out.println(hamburger + sprite - 50);

	}

}
