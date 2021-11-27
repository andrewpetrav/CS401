
public class Book implements Comparable<Book>{
	public String title; //title of book
	public String owner; //who owns the book
	public String store;
	
	public Book() { //default constructor
		title=null;
		owner=null;
		store=null;
	}
	
	public Book(String t, String o, String s) { //non default constructor
		title=t;
		owner=o;
		store=s;
	}

	public int compareTo(Book o) {
		int ret=title.compareTo(o.title);
		if(ret==0) { //still unclear which one to come first
			ret=owner.compareTo(o.owner); //compare based on next key: owner
			if(ret==0) { //if still unclear
				ret=store.compareTo(o.store); //compare based on final key: store
			}
		}
		return ret;
	}
	
	public String toString() {
		return title+", "+owner+", "+store;
	}

}
