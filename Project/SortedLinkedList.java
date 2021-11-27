
public class SortedLinkedList<T extends Comparable<T>> implements CollectionInterface<T> {
	
	public LLNode<T> head; //holds the head node
	public LLNode<T> curr; //holds current position
	int length; //how many nodes the list has
	
	private class LLNode<T>{
		T data;
		LLNode<T> next;
		
		private LLNode(T d, LLNode<T> n) { //non default constructor
			data=d;
			next=n;
		}
	}
	
	public SortedLinkedList() { //default constructor
		head=null;
		length=0;
	}
	
	
	public void add(T element) {
		LLNode<T> toAdd=new LLNode<T>(element, null);
		if(head==null || head.data.compareTo(toAdd.data)>0) { //special case for the head node (node toAdd first)
			toAdd.next=head;
			head=toAdd;
		}
		else { //otherwise
			curr=head;
			while(curr.next!=null && curr.next.data.compareTo(toAdd.data)<0) {
				curr=curr.next;
			}
			toAdd.next=curr.next;
			curr.next=toAdd;
		}		
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
			else if(curr.data.compareTo(element)>0) {//if pass the point where element should be
				return false;
			}
		}
		return false; //not found
	}

}
