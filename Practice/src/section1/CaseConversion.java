package section1;

import java.util.Scanner;

public class CaseConversion {
	public void solution(String str) {
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int a = (int)c;
			if(a >= 97 ) {
				a = a - 32;
				System.out.print((char)a);
			}
			else {
				a = a + 32;
				System.out.print((char)a);
			}
		}
	}

	public static void main(String[] args) {
		CaseConversion test = new CaseConversion();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		test.solution(str);
	}

}
