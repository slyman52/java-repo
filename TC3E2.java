package tutorials;
//rectangle

// 2 double width height
// define 1.0
		
// no constructor to define
// constructor for user-input
// getArea()
// getPerimeter()
public class TC3E2 {

	public static void main(String[] args) {
	
	java.util.Scanner In = new java.util.Scanner(System.in);
	Rectangles object1 = new Rectangles();
	System.out.println("Width of Rectangle = " + object1.getWidth());
	System.out.println("Height of Rectangle = " + object1.getHeight());
	System.out.println("Area of Rectangle = " + object1.getArea());
	System.out.println("Perimeter of Rectangle = " + object1.getPerimeter());
	double w,h;
	System.out.println("Rectangle Area and Perimeter \n");
	
	System.out.println("Width  : ");
	w = In.nextDouble();
	System.out.println("Height :");
	h = In.nextDouble();
	
	System.out.println("\n");

	object1.setRectangle(w, h);
	System.out.println("Width of Rectangle = " + object1.getWidth());
	System.out.println("Height of Rectangle = " + object1.getHeight());
	System.out.println("Area of Rectangle = " + object1.getArea());
	System.out.println("Perimeter of Rectangle = " + object1.getPerimeter());

	
	In.close();
	}
}

class Rectangles {
	
	private double width = 1.0;
	private double height = 1.0;
	
	public void setRectangle (double width, double height) {
		
	this.width = width;
	this.height = height;
	}
	
	public double getWidth() {
		
		return this.width ;
	}
	
	public double getHeight() {
		
		return this.height ;
	}
	public double getArea() {
	
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		
		return 2 * (this.width + this.height);
	}
}
