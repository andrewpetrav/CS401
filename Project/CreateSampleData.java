import java.io.File;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateSampleData {
	
	public void generateStringDataFile() throws IOException {
		String[] names={"Andrew","Chelsea","Tiffany", "Isa", "Breonna", "Thomas","Javi","Cassie","Ana","Jerry","Nadia","David","Annika","Skyler",
				"Jake", "Kait", "Sean", "Faith", "Chris", "Maggie", "Ursula", "Cameron", "Trevor", "Alyssa", "Bryan","Victoria", "Avery"}; //sample names to choose from
		String[] titles= {"Foundation", "Dune", "Lord of the Rings", "The Princess Bride", "The Handmaid's Tale", "To Kill A Mockingbird",
				"Dracula", "I, Robot", "2001: A Space Odyssey", "1984", "Lord of the Flies", "Fahrenheit 451", "Frankenstein", "11/22/63",
				"Hamlet", "One Flew Over The Cuckoo's Nest","In The Garden of Beasts", "Mario Party 2: Instruction Manual", "Homo Deus", 
				"Don Quixote", "Dante's Inferno", "Brave New World", "The Things They Carried", "The Jungle"}; //sample books to choose from
		String[] stores= {"Half-Priced Books", "IIT Bookstore", "Barnes and Nobles","ThriftBooks","Target"};
		ArrayList<Book> data=new ArrayList<>();
		String fileName="StringDataFile.csv"; //name of what the csv file will be called
		
		while(data.size()<100) { //generate 100 data points
			int nameIndex=(int) Math.random()*names.length;
			int titleIndex=(int) Math.random()*titles.length;
			int storeIndex=(int) Math.random()*stores.length;
			
			String name=names[nameIndex]; //name 
			String bookTitle=titles[titleIndex]; //title
			String storeName=stores[storeIndex];
			boolean flag=false; //true if data point already exists
			for(Book e: data) {
				if(e.owner.equals(name)) {
					if(e.title.equals(bookTitle)) {
						if(e.store.equals(storeName)) {
							flag=true;
							break; //this data already exists
						}
					}
				}				
			}
			if(!flag){ //if data point doesn't already exist...
				Book book=new Book(name, bookTitle, storeName); //create it
				data.add(book); //add to data
			}
		}
		
		writeDatatoCSV(fileName,data);
	}
	
	public String toCSV(String[] data) {	
		return Stream.of(data)
				.collect(Collectors.joining(","));
	}
	
	public <T> void writeDatatoCSV(String fileName, ArrayList<T> data) throws IOException{
		File file=new File(fileName);
		try(PrintWriter pw=new PrintWriter(file)){
			data.stream()
				.map(this::converToCSV)
		}
	}
	
	
}
