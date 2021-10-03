import java.util.ArrayList;
public class Stack {
	ArrayList<Employee> stack=new ArrayList<Employee>();	 //stack object (as an array list)

	public Stack(ArrayList<Employee> emps) { //constructor
		stack=emps;
	}
	public Stack() { //default constructor
		
	}
	
	public void push(Employee emp) {
		stack.add(0, emp);
	}
	
	public Employee pop() {
		if(!stack.isEmpty()) { //to avoid any errors
			Employee toRet=stack.get(0); //get last element of stack
			stack.remove(0); //"pop" the stack (remove last element)
			return toRet; //return the popped element
		}
		else {
			return null;
		}
		
	}
	
	public Employee peek() {
		if(!stack.isEmpty()) { //to avoid errors
			return(stack.get(0)); //return the employee at the top of the stack
		}
		return null;
	}

	public String toString() {
		String toRet=""; //what we will be returning
		for(Employee e: stack) { //iterate thru stack
			toRet+=e.getName()+" "+e.getID()+"\n";
		}
		return toRet;
	}
	
	public boolean isEmpty() { //will return if the stack is empty or not
		return stack.isEmpty();
	}
	

}
