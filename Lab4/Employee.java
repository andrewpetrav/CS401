
public class Employee {
	String name;
	String ID;
	public Employee(String name, String ID) {
		this.name=name;
		this.ID=ID;
	}
	
	//setters
	public void setName(String name) {
		this.name=name;
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	//getters
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
}
