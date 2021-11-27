
public class LinkedList<T extends Comparable<T>> implements CollectionInterface<T> {
	public LLNode<T> head; //holds the head node
	public LLNode<T> curr;
	int length; //how many nodes the list has
	
	private class LLNode<T>{
		T data;
		LLNode<T> next;
		
		private LLNode(T d, LLNode<T> n) { //non default constructor
			data=d;
			next=n;
		}
	}
	
	public LinkedList() { //default constructor
		head=null;
		length=0;
	}
	
	public void add(T element) {
		head=new LLNode<T>(element, head);
		length++;
	}
	
	public void print() {
		curr=head;
		while(curr!=null) { //while not null
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	
	public boolean seqSearch(T element) {
		curr=head;
		while(curr!=null) {
			if(curr.data.equals(element)) {
				return true; //if found
			}
		}
		return false; //not found
	}
	
	

}
