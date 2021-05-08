package section1;

import java.util.Scanner;

public class FindCharacter {
	public int solution(String str, char c){
		int answer = 0;
    
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == c){
				answer++;
	      }
	    }
	    return answer;
  }
	public static void main(String[] args){
	    FindCharacter T = new FindCharacter();
	    Scanner in=new Scanner(System.in);
	    
	    String str = in.next();
	    char c = in.next().charAt(0);
	    
		str = str.toUpperCase();
	    c = Character.toUpperCase(c);
	    
	    System.out.println(T.solution(str, c));

	}
}