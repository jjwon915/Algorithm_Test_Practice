package sectionSevenRepeat;

class NodeDFS {
	NodeDFS lt, rt;
	int data;
	public NodeDFS(int value) {
		this.data = value;
		lt = rt = null;
	}
}

public class SearchBinaryTree_DFS {

	static NodeDFS root;
	
	public void DFS(NodeDFS root) {
		if(root == null) return;
		else {
			System.out.print(root.data + " ");
			DFS(root.lt);
			DFS(root.rt);
		}
	}
	
	public static void main(String[] args) {
		
		SearchBinaryTree_DFS T = new SearchBinaryTree_DFS();
		root = new NodeDFS(1);
		root.lt = new NodeDFS(2);
		root.rt = new NodeDFS(3);
		root.lt.lt = new NodeDFS(4);
		root.lt.rt = new NodeDFS(5);
		root.rt.lt = new NodeDFS(6);
		root.rt.rt = new NodeDFS(7);
		
		T.DFS(root);

	}

}
