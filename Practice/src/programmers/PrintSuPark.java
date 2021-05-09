package programmers;

import java.util.Scanner;

public class PrintSuPark {

	public String solution(int n) {
		String answer = "";
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                answer += "¼ö";
            }
            else{
                answer += "¹Ú";
            }
        }
        return answer;
    }


	public static void main(String[] args) {
		PrintSuPark T = new PrintSuPark();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(T.solution(n));
	}

}
