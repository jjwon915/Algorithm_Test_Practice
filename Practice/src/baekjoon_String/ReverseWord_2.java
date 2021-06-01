package baekjoon_String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ReverseWord_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String s = br.readLine();
        boolean tag = false;
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '<') {
        		tag = true;
        		while(!stack.isEmpty()) {
        			bw.write(stack.pop());
        		}
        		bw.write(s.charAt(i));
        	}
        	else if(s.charAt(i) == '>') {
        		tag = false;
        		bw.write(s.charAt(i));
        	}
        	else if(tag == true) {
        		bw.write(s.charAt(i));
        	}
        	else {
        		if(s.charAt(i) == ' ') {
        			while(!stack.isEmpty()) {
        				bw.write(stack.pop());
        			}
        			bw.write(" ");
        		}
        		else {
        			stack.push(s.charAt(i));
        		}
        	}
        }
        
        while(!stack.isEmpty()) {
        	bw.write(stack.pop());
        }
        
        bw.flush();
        br.close();
        bw.close();

	}

}
