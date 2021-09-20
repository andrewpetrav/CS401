
public class Circle {
	
	double radius; //user defined
	
	//Setter
	public void setRadius(Double r) {
		radius=r;
	}
	
	//Getters
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return(Math.PI*Math.pow(this.getRadius(),2));
	}
	
	public static boolean compareCircles(Circle c1, Circle c2) {
		if(c1.getRadius()==c2.getRadius()) { //if circles have the same radius, then they must be equal
			return true;
		}
		return false;
	}
	
	public String toString() { //returns the area of the circle
		return("The area of the circle is: "+ this.getArea());
	}
	

}
