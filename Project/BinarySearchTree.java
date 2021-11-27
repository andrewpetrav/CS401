
public class BinarySearchTree<T extends Comparable<T>> implements CollectionInterface<T> {
	
	Node<T> root;
	
	private class Node<T>{
		T data;
		Node<T> left;
		Node<T> right;
		
		private Node(T d, Node<T> l, Node<T> r) { //non default constructor
			data=d;
			left=l;
			right=r;
		}
	}
	
	public BinarySearchTree() { //default constructor
		root=null;
	}

	public void add(T element) {
		root=addRec(root, element);
	}
	
	public Node<T> addRec(Node<T> root, T element) {
		if (root == null){ //if tree empty
            root = new Node<T>(element, null, null);
            return root;
        }
		if(element.compareTo(root.data)<0) { //if smaller
			root.left=addRec(root.left, element);
		}
		else if(element.compareTo(root.data)>0) { //if larger
			root.right=addRec(root.right, element);
		}
        return root; //return node pointer
	}
 

	public void print() {
		inOrder(root); //call helper method
	}
	
	private void inOrder(Node node) {
	    if (node == null) { //if reach end
	      return;
	    }
	    inOrder(node.left);
	    System.out.println(node.data);
	    inOrder(node.right);
	}
	
	public Node<T> binSearch(Node<T> root, T x) {
		if(root==null || root.data.equals(x)) { //base case: if root null or element at root
			return root;
		}
		else if(root.data.compareTo(x)<0) { //if target greater than node.data
			return binSearch(root.right, x);
		}
		return binSearch(root.left, x); //target smaller than node.data
	}
}
