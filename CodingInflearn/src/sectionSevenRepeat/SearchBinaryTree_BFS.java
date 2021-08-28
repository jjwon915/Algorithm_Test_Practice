package sectionSevenRepeat;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS{
	NodeBFS lt, rt;
	int data;
	
	public NodeBFS(int value) {
		this.data = value;
		lt = rt = null;
	}
}
public class SearchBinaryTree_BFS {

	static NodeBFS root;
	
	public void BFS() {
		Queue<NodeBFS> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int len = queue.size();
			for(int i = 0; i < len; i++) {
				NodeBFS current = queue.poll();
				System.out.print(current.data + " ");
				if(current.lt != null) queue.add(current.lt);
				if(current.rt != null) queue.add(current.rt);
			}
		}
	}
	
	public static void main(String[] args) {
		
		SearchBinaryTree_BFS T = new SearchBinaryTree_BFS();
		T.root = new NodeBFS(1);
		T.root.lt = new NodeBFS(2);
		T.root.rt = new NodeBFS(3);
		T.root.lt.lt = new NodeBFS(4);
		T.root.lt.rt = new NodeBFS(5);
		T.root.rt.lt = new NodeBFS(6);
		T.root.rt.rt = new NodeBFS(7);
		
		T.BFS();

	}

}
