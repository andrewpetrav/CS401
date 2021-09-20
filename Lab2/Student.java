import java.util.Scanner; //used to get user input
public class Student {
	//variables
	String id;
	String name;
	
	public static void main(String[] args) {
		//Student objects
		Student s1=new Student();
		Student s2=new Student();
		
		Scanner sc=new Scanner(System.in);
		while(true) { //main loop
			System.out.println("Enter in the name of the first student ");
			String input=sc.nextLine();
			s1.setName(input); //set name of student 1
			System.out.println("Enter in the id of the first student ");
			input=sc.nextLine();
			s1.setId(input); //set id of student 1
			
			System.out.println("Enter in the name of the second student ");
			input=sc.nextLine();
			s2.setName(input); //set name of student 1
			System.out.println("Enter in the id of the second student ");
			input=sc.nextLine();
			s2.setId(input); //set id of student 1
			
			if(compareStudents(s1,s2)) { //if students have same name and if
				System.out.println("The students are the same");
			}
			else { //if they don't
				System.out.println("The students are not the same");
			}
		}
	}
	
	//Setters
	public void setId(String id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	//Getters
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	//Return name and ID
	public String toString() {
		return("Name: "+this.name+"    ID: "+this.id);
	}
	
	public static boolean compareStudents(Student s1, Student s2) {
		if((s1.getName()).equals(s2.getName())) {
			if((s1.getId()).equals(s2.getId())) {
				return true; //if both names and ids are the same, return true
			}
		}
		return false; //if either names or ids aren't same, return false
	}

}
