import java.io.*;
import java.util.ArrayList;
public class Driver {
	public static void main(String[] args) {
		File file = new File("emp.txt");
		Stack stack=new Stack(); //stack object
		BufferedReader reader; //reader
		try {
			reader=new BufferedReader(new FileReader(file)); //read from emp.txt
			String line;
			while((line=reader.readLine())!=null) { //while haven't reached EOF
				String[] data=line.split(" "); //data[0] will hold name, date[1] will hold id
				Employee emp=new Employee(data[0], data[1]); //create new employee object
				stack.push(emp); //push to stack

			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		Employee e=stack.peek(); //employee on top of stack
		while(!stack.isEmpty()) { //while the stack isn't empty
			//Print out top element
			System.out.println(e.getName()+" "+e.getID()); //print out name and ID of top employee
			//Pop next two elements
			stack.pop();
			stack.pop();
			//Peek 
			e=stack.peek();
		}
		
		
	}
	
}
