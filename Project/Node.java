
public class Node {
	Node parent;
	Node left;
	Node right;
	int key;
	
	public Node() { //default constructor
		parent=null;
		left=null;
		right=null;
		key=0;
	}
	
	public Node(Node p, Node l, Node r, int k) { //non default constructor
		parent=p;
		left=l;
		right=r;
		key=k;
	}
	
	
}
