package programmers;

import java.util.Scanner;

public class HidePhoneNumber {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length() - 4; i++){
            answer = answer + "*";
        }
        String end = phone_number.substring(phone_number.length()-4, phone_number.length());
        answer = answer + end;
        return answer;
    }

	public static void main(String[] args) {
		HidePhoneNumber T = new HidePhoneNumber();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}
