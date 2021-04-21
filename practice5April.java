package practices;

import exercises.Rectangle;

public class practice5April {

	public static void main(String[] args) {
	
	Rectangle rectangle1 = new Rectangle();
	
	System.out.println("The width is " + rectangle1.width );
	System.out.println("The height is " + rectangle1.height);
	System.out.println("The area is " + rectangle1.getArea());
	System.out.println("The perimeter is " + rectangle1.getPerimeter());
	
	Rectangle rectangle2 = new Rectangle (4.0, 40.0);
	
	System.out.println("The width is " + rectangle2.width );
	System.out.println("The height is " + rectangle2.height);
	System.out.println("The area is " + rectangle2.getArea());
	System.out.println("The perimeter is " + rectangle2.getPerimeter());
	
	Rectangle rectangle3 = new Rectangle (3.5, 35.9);
	
	System.out.println("The width is " + rectangle3.width );
	System.out.println("The height is " + rectangle3.height);
	System.out.println("The area is " + rectangle3.getArea());
	System.out.println("The perimeter is " + rectangle3.getPerimeter());
	}

}

class Rectangle {
	
	double width, height;
	
	Rectangle(){

	width = 1.0;
	height = 1.0;
	
	}
	
	Rectangle(double Width,double Height){
	this.width = Width;
	this.height = Height;
	}
	
	double getArea() {
		
	return width * height;
	
	}
	
	double getPerimeter () {
	
	return 2*(width + height);
	
	}
}