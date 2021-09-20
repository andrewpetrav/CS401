import java.util.Scanner; //used to get user input
public class CircleRunner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //create scanner object
		//create circle objects
		Circle c1=new Circle();
		Circle c2=new Circle();
		while(true) { //loop until exit
			while(true) { //set radius of first circle (loop until valid input)
				System.out.print("Enter the radius of your first circle: ");
				try {
					double input=Double.parseDouble(sc.nextLine());
					if(input<=0) { //make sure user doesn't enter a 0 or negative number
						System.out.println("Please enter a valid, positive number");
					}
					else {
						c1.setRadius(input);
						System.out.println(c1.toString());
						break;
						
					}
				}catch(Exception e) { //if user didn't enter in a number
					System.out.println("Please enter in a number");
				}
			}
			while(true) { //set radius of second circle (loop until valid input)
				System.out.print("Enter the radius of your second circle: ");
				try {
					double input=Double.parseDouble(sc.nextLine());
					if(input<=0) { //make sure user doesn't enter a 0 or negative number
						System.out.println("Please enter a valid, positive number");
					}
					else {
						c2.setRadius(input);
						System.out.println(c2.toString());
						break;
						
					}
				}catch(Exception e) { //if user didn't enter in a double
					System.out.println("Please enter in a number");
				}
			}
			//if the circles are equal, print it out
			if(Circle.compareCircles(c1,c2)) {
				System.out.println("The circles are equal");
			}
			else { //else, print they are not equal
				System.out.println("The circles are not equal");
			}
		}

	}

}
