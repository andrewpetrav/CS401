
public class Book {
	public String title; //title of book
	public String owner; //who owns the book
	public String store;
	//TODO add more
	
	public Book() { //default constructor
		title=null;
		owner=null;
		store=null;
		//...
	}
	
	public Book(String t, String o, String s) { //non default constructor
		title=t;
		owner=o;
		store=s;
	}

}
