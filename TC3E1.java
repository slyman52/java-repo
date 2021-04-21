package tutorials;

//cylinder
		// store radius height
		// method calculate volume
		
		// initiate radius height
		// calc vol
		
		// ask radius from user
		// create a new object
		// calc volume x display
		
		//Pi = 3.14159

public class TC3E1 {

	public static void main(String[] args) {
		
	java.util.Scanner In = new java.util.Scanner(System.in);
	Cylinder object1 = new Cylinder();
	
	System.out.println("CYLINDER VOLUME CALCULATOR ");
	System.out.println("Put a Radius value : ");
	object1.setRadius(In.nextDouble());
	
	System.out.println("Put a height value : ");
	object1.setHeight(In.nextDouble());
	
	System.out.println("Cylinder Volume is = " + object1.getVolume());
	
	In.close();
	}

}

class Cylinder {
	
	double radius = 1.0, height = 1.0;
	double PI = 3.14159;
	
	public double getVolume () {
		
		return height * radius * radius * PI;
	}
	public void setHeight (double height) {
		
		this.height = height;
	}
	
	public void setRadius (double radius) {
		
		this.radius = radius;
	}
}
