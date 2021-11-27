import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver<T extends Comparable<T>> {
	
	public static void main(String[] args) {
		
		Book[] bookArray=new Book[100]; //unsorted
		int bookIndex=0; //holds next free book index
		Integer[] numArray=new Integer[2000]; //unsorted
		int numIndex=0; //holds next free num index
		//read files
		try {
			File stringFile=new File("StringDataFile.txt");
			File numFile=new File("NumberDataFile.txt");
			Scanner stringReader=new Scanner(stringFile);
			Scanner numReader=new Scanner(numFile);
			while(stringReader.hasNextLine()) { //read entire file
				String data=stringReader.nextLine();
				String[] values=data.split(","); //split by comma
				Book book=new Book(values[0], values[1], values[2]); //create book object
				bookArray[bookIndex]=book; //add to array
				bookIndex++;
			}
			stringReader.close(); //close scanner
			while(numReader.hasNextLine()) {
				int num=numReader.nextInt();
				numArray[numIndex]=num;
				numIndex++;	
			}
			numReader.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//create structs
		//arrays
		SortedArray<Book> arrayBookSorted=new SortedArray<Book>(100); //sorted string
		Array<Book> arrayBookUnsorted=new Array<Book>(100); //unsorted string
		SortedArray<Integer> arrayNumSorted=new SortedArray<Integer>(2000); //sorted num
		Array<Integer> arrayNumUnsorted=new Array<Integer>(2000); //unsorted num
		//linked lists
		SortedLinkedList<Book> linkedListBookSorted=new SortedLinkedList<Book>(); //sorted string
		LinkedList<Book> linkedListBookUnsorted=new LinkedList<Book>(); //unsorted string
		SortedLinkedList<Integer> linkedListNumSorted=new SortedLinkedList<Integer>(); //sorted num
		LinkedList<Integer> linkedListNumUnsorted=new LinkedList<Integer>(); //unsorted num
		//BSTs
		BinarySearchTree<Book> bstBook=new BinarySearchTree<Book>();
		BinarySearchTree<Integer> bstNum=new BinarySearchTree<Integer>();

		//mainMenu();
		
		//fill structs
		//arrays
		for(int i=0; i<bookArray.length; i++) { //sorted string
			arrayBookSorted.add(bookArray[i]);
		}
		for(int i=0; i<bookArray.length; i++) { //unsorted string
			arrayBookUnsorted.add(bookArray[i]);
		}
		for(int i=0; i<numArray.length; i++) { //sorted num
			arrayNumSorted.add(numArray[i]);
		}
		for(int i=0; i<numArray.length; i++) { //unsorted num
			arrayNumUnsorted.add(numArray[i]);
		}
		//linked lists
		for(int i=0; i<bookArray.length; i++) { //sorted string
			linkedListBookSorted.add(bookArray[i]);
		}
		for(int i=0; i<bookArray.length; i++) { //unsorted string
			linkedListBookUnsorted.add(bookArray[i]);
		}
		for(int i=0; i<numArray.length; i++) { //sorted num
			linkedListNumSorted.add(numArray[i]);
		}
		for(int i=0; i<numArray.length; i++) { //unsorted num
			linkedListNumUnsorted.add(numArray[i]);
		}
		//BSTs
		for(int i=0; i<bookArray.length; i++) { //sorted string
			bstBook.add(bookArray[i]);
		}
		for(int i=0; i<numArray.length; i++) { //sorted string
			bstNum.add(numArray[i]);
		}
		
		//print structs
		//arrays
		//arrayBookSorted.print();
		//arrayBookUnsorted.print();
		//arrayNumSorted.print();
		//arrayNumUnsorted.print();
		//linked lists
		//linkedListBookSorted.print(); //sorted string
		//linkedListBookUnsorted.print(); //unsorted string
		//linkedListNumSorted.print(); //sorted num
		//linkedListNumUnsorted.print(); //unsorted num
		//BSTs
		//bstBook.print(); //string
		//bstNum.print(); //num

		//if binSearch ==null: not found
		
	}
	
	public static void mainMenu() {
		
	}


}
