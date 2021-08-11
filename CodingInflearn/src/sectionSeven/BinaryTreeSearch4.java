package sectionSeven;

import java.util.LinkedList;
import java.util.Queue;

class Node4{
	int data;
	Node4 lt, rt;
	public Node4(int value) {
		data = value;
		lt = rt = null;
	}
}

public class BinaryTreeSearch4 {

	Node4 root;
	
	public void BFS(Node4 root) {
		
		Queue<Node4> queue = new LinkedList<>();
		// 큐에 root 하나 들어가 있음.
		queue.offer(root);
		int L = 0;
		while(!queue.isEmpty()) {
			int len = queue.size();
			System.out.print(L + " : ");
			for(int i = 0; i < len; i++) {
				// 큐에서 하나 꺼냄.
				Node4 current = queue.poll();
				System.out.print(current.data + " ");
				// current에서 lt와 rt가 있는 경우 큐에 offer.
				if(current.lt != null) queue.offer(current.lt);
				if(current.rt != null) queue.offer(current.rt);
			}
			L++;
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryTreeSearch4 tree = new BinaryTreeSearch4();
		tree.root = new Node4(1);
		tree.root.lt = new Node4(2);
		tree.root.rt = new Node4(3);
		tree.root.lt.lt = new Node4(4);
		tree.root.lt.rt = new Node4(5);
		tree.root.rt.lt = new Node4(6);
		tree.root.rt.rt = new Node4(7);
		tree.BFS(tree.root);

	}

}
