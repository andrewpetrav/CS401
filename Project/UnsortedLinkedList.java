
public class UnsortedLinkedList extends LinkedList {
	
	public UnsortedLinkedList() { //default constructor
		super(); //call super
	}
	
	public void addNode(NodeLinked n) {
		tail.next=n;
		n.prev=tail;
		tail=n;
		length++;
	}
	
	public void removeNode(NodeLinked n) {
		int index=contains(n); //check if in list and get index
		//is this even needed?
	}
	
	public int contains(NodeLinked n) { //return index of the given node (-1 if not there)
		int index=0;
		current=head; //start at head
		while(current!= null) { //while still in list
			if(current==n) { //if same node
				return index;
			}
			index++; //increment
			current=current.next; //not found? go to next node
		}
		return -1; //if not found
	}
}
