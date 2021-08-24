package sectionSeven;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS{
	NodeBFS lt, rt;
	int data;
	public NodeBFS(int value) {
		data = value;
		lt = rt = null;
	}
}

public class TreeBFS {

	NodeBFS root;
	
	public int BFS(NodeBFS root) {
		Queue<NodeBFS> queue = new LinkedList<>();
		queue.offer(root);
		int L = 0;
		
		while(!queue.isEmpty()) {
			int len = queue.size();
			for(int i = 0; i < len; i++) {
				NodeBFS current = queue.poll();
				if(current.lt == null && current.rt == null)
					return L;
				if(current.lt != null)
					queue.offer(current.lt);
				if(current.rt != null)
					queue.offer(current.rt);
			}
			L++;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		TreeBFS tree = new TreeBFS();
		tree.root = new NodeBFS(1);
		tree.root.lt = new NodeBFS(2);
		tree.root.rt = new NodeBFS(3);
		tree.root.lt.lt = new NodeBFS(4);
		tree.root.lt.rt = new NodeBFS(5);
		
		System.out.println(tree.BFS(tree.root));
		
	}

}

