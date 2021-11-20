
public class NodeLinked<T> { //bounded
	NodeLinked<T> prev;
	NodeLinked<T> next;
	T key;
	
	//key/data -- what's the data type??
	
	public NodeLinked() { //default constructor
		prev=null;
		next=null;
		key=null;
	}
	
	public NodeLinked(T k) { //non default constructor
		key=k;
	}
	
}
