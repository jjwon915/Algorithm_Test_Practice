package sectionSevenRepeat;

import java.util.LinkedList;
import java.util.Queue;

class NodeB{
	NodeB lt, rt;
	int data;
	public NodeB(int value) {
		lt = rt = null;
		this.data = value;
	}
}

public class ShortRouteBFS {
	
	static NodeB root;

	public static int BFS() {
		
		int level = 0;
		Queue<NodeB> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int len = queue.size();
			for(int i = 0; i < len; i++) {
				NodeB current = queue.poll();
				if(current.lt == null && current.rt == null) return level;
				else {
					if(current.lt != null) queue.add(current.lt);
					if(current.rt != null) queue.add(current.rt);
				}
			}
			level++;
		}
		
		return level;
	}
	
	public static void main(String[] args) {
		
		root = new NodeB(1);
		root.lt = new NodeB(2);
		root.rt = new NodeB(3);
		root.lt.lt = new NodeB(4);
		root.lt.rt = new NodeB(5);
		
		System.out.println(BFS());

	}

}
