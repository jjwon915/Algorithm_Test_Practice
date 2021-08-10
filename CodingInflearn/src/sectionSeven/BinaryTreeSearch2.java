package sectionSeven;

// 중위순회
class Node2{
	
	int data;
	Node2 lt;
	Node2 rt;
	
	public Node2(int value) {
		data = value;
		lt = rt = null;
	}
}

public class BinaryTreeSearch2 {
	
	Node2 root;
	public void DFS(Node2 root) {
		if(root == null) return;
		else {
			DFS(root.lt);
			System.out.print(root.data + " ");
			DFS(root.rt);
		}
	}

	public static void main(String[] args) {
		
		BinaryTreeSearch2 tree = new BinaryTreeSearch2();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		tree.DFS(tree.root);
		
	}

}
