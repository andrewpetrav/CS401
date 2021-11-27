
public class SortedArray<T extends Comparable<T>> implements CollectionInterface<T> {
	protected int size;
	protected T[] elements;
	protected int numElements;
	public int counter=0;
	
	public SortedArray() { //default constructor
		
	}
	
	public SortedArray(int s) { //non default constructor
		int size=s;
		elements=(T[]) new Comparable[size];
		numElements=0; 
	}
	
	public void add(T element) {
		if(numElements==0) { //if empty
			elements[0]=element;
		}
		else { //not empty
			int i;
			for(i=0; i<numElements; i++) { //numElements-1?
				if(elements[i].compareTo(element)>0) { //stop when next element bigger than element trying to add
					break;
				}
			}
			for(int j=numElements-1; j>=i; j--) {
				elements[j+1]=elements[j];
			}
			elements[i]=element;
		}
		numElements++; //increment
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
			else if(elements[i].compareTo(element)>0) { //if pass the point where element should be
				return false; //not in
			}
		}
		return false; //if not found
	}
	
	public int binSearch(T arr[], int l, int r, T x){
	    if (r >= l) { //if right>=left
	        int mid = l + (r - l) / 2;
	        if (arr[mid].equals(x)) { //if this is element
	        	return mid;
	        }
	        else if (arr[mid].compareTo(x) > 0) { //if element < mid, get left subarray
	            return binSearch(arr, l, mid - 1, x);
	        }
	        return binSearch(arr, mid + 1, r, x); //else must be in right subarray
	    }
	    return -1; //not found
	}

}
