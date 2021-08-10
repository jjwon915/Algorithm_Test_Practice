package sectionSeven;

// 중위순회
class Node3{
	
	int data;
	Node3 lt;
	Node3 rt;
	
	public Node3(int value) {
		data = value;
		lt = rt = null;
	}
}

public class BinaryTreeSearch3 {
	
	Node3 root;
	public void DFS(Node3 root) {
		if(root == null) return;
		else {
			DFS(root.lt);
			DFS(root.rt);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String[] args) {
		
		BinaryTreeSearch3 tree = new BinaryTreeSearch3();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		tree.root.rt.lt = new Node3(6);
		tree.root.rt.rt = new Node3(7);
		tree.DFS(tree.root);
		
	}

}
