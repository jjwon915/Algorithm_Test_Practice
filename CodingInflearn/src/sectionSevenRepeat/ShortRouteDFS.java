package sectionSevenRepeat;

class NodeD{
	NodeD lt, rt;
	int data;
	public NodeD(int value) {
		lt = rt = null;
		this.data = value;
	}
}

public class ShortRouteDFS {

	static NodeD root;
	
	public static int DFS(int level, NodeD root) {
		
		if(root.lt == null && root.rt == null) return level;
		else {
			return Math.min(DFS(level + 1, root.lt), DFS(level + 1, root.rt));
		}
	}
	
	public static void main(String[] args) {
		
		root = new NodeD(1);
		root.lt = new NodeD(2);
		root.rt = new NodeD(3);
		root.lt.lt = new NodeD(4);
		root.lt.rt = new NodeD(5);
		
		System.out.println(DFS(0, root));

	}

}
