//Linked List is bounded
public class LinkedList<T> { //superclass of unsorted linked list and sorted linked list
	NodeLinked<T> head; //first node in list
	NodeLinked<T> tail; //last node in list
	NodeLinked<T> current; //current node being pointed to
	int length; //holds length of list
	
	public LinkedList() { //default constructor
		head=null;
		tail=null;
		current=null;
		length=0;
	}
	

}
