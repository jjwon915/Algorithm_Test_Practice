package baekjoon;

import java.util.Scanner;

public class Stack {
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
			return -1;
		return 0;
	}
	
	public int top() {
		if(size == 0)
			return -1;
		else
			return stack[size - 1];
	}

	public static void main(String[] args) {
		Stack T = new Stack();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		stack = new int[n];

		for(int i = 0; i < n; i++) {

			String str = in.next();
			switch(str) {
				case "push":
					T.push(in.nextInt());
					break;
				case "pop":
					System.out.println(T.pop());
					break;
				case "size":
					System.out.println(T.size());
					break;
				case "empty":
					System.out.println(T.empty());
					break;
				case "top":
					System.out.println(T.top());
					break;
			}
		}	
	}
}
