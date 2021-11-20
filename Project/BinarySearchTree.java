import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {
	
	Node root;

	public BinarySearchTree() { //default constructor
		
	}
	
	public BinarySearchTree(Node r) { //non default constructor
		root=r;
	}
	
	public void insert(Node n) {
		Node c=root;
		while(true) {
			if(n.key<c.key) { //if node's key less than
				if(c.left==null) { //if left node null
					//set n as c's left child
					c.left=n;
					n.parent=c;
					break;
				}
				c=c.left; //else if not null, go left
			}
			else { //node's key greater than
				if(c.right==null) {
					//set n as c's right child
					c.right=n;
					n.parent=c;
					break;
				}
				c=c.right; //else if not null, go right
			}
		}
	}
	
	public int findMaxDepth(Node root) { //finds the max depth of the tree
		if(root==null) {
			return 0;
		}
		int left=findMaxDepth(root.left); //max depth of left subtree
		int right=findMaxDepth(root.right); //max depth of right subtree
		if(left>right) {
			return left+1;
		}
		return right+1;
	}
	
	public int iterSize() { //find size iteratively
		Node n=root;
		Node temp; //temp holder
		int size=0;
		if(root==null) {
			return size;
		}
		Queue<Node>queue=new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()) { //while the queue is not empty
			temp=queue.remove(); //remove node 
			size++; //increment size
			Node left=temp.left;
			Node right=temp.right;
			if(left!=null) { //if left child not null
				queue.add(left); //add it to the queue
			}
			if(right!=null) { //if right child not null
				queue.add(right); //add it to the queue
			}
		}
		return size;
	}
	
	public int recurSize(Node node) { //find size recursively
		if(node==null) {
			return 0;
		}
		return(recurSize(node.left)+recurSize(node.right)+1);
	}
	
	public void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.key+", ");
		inorder(node.right);
	}

	public void preorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.key+", ");
		preorder(node.left);
		preorder(node.right);
	}

	public void postorder(Node node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.key+", ");
	}
	

}
