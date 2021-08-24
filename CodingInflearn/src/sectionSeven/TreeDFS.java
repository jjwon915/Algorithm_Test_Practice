package sectionSeven;

class NodeDFS{
	NodeDFS lt, rt;
	int data;
	public NodeDFS(int value) {
		data = value;
		lt = rt = null;
	}
}

public class TreeDFS {

	NodeDFS root;
	
	public int DFS(int L, NodeDFS root) {
		if(root.lt == null && root.rt == null)
			return L;
		else
			return Math.min(DFS(L+1,  root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		
		TreeDFS tree = new TreeDFS();
		tree.root = new NodeDFS(1);
		tree.root.lt = new NodeDFS(2);
		tree.root.rt = new NodeDFS(3);
		tree.root.lt.lt = new NodeDFS(4);
		tree.root.lt.rt = new NodeDFS(5);
		
		System.out.println(tree.DFS(0, tree.root));
		
	}

}
