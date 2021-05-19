package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stack_1 {

	public static int[] stack;
	public static int size = 0;
	
	public void push(int num) {
		stack[size] = num;
		size++;
	}
	
	public int pop() {
		if(size == 0)
			return -1;
		else {
			int p = stack[size - 1];
			size--;
			return p;
		}
	}
	
	public int size() {
		return size;
	}
	
	public int empty() {
		if(size == 0)
			return 1;
		return 0;
	}
	
	public int top() {
		if(size == 0)
			return -1;
		else
			return stack[size - 1];
	}
	
	public static void main(String[] args) throws IOException {
		Stack_1 T = new Stack_1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		stack = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "push":
					T.push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(T.pop()).append('\n');
					break;
				case "size":
					sb.append(T.size()).append('\n');
					break;
				case "empty":
					sb.append(T.empty()).append('\n');
					break;
				case "top":
					sb.append(T.top()).append('\n');
					break;
			}
		}
		System.out.println(sb);
	}

}
