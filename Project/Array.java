
public class Array<T extends Comparable<T>> implements CollectionInterface<T> {
	protected int size;
	protected T[] elements;
	protected int numElements;
	
	public Array() { //default constructor
		
	}
	
	public Array(int s) { //non default constructor
		int size=s;
		elements=(T[]) new Comparable[size];
		numElements=0; 
	}
	
	public void add(T element) {
		elements[numElements]=element; //insert at next free slot
		numElements++;
	}
	
	
	public void print() {
		for(int i=0; i<numElements; i++) {
			System.out.println(elements[i]);
		}
	}
	
	public boolean seqSearch(T element) {
		for(int i=0; i<numElements; i++) {
			if(elements[i].equals(element)) {
				return true; //if found
			}
		}
		return false; //if not found
	}
	

}
