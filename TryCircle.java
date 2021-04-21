package practices;



public class TryCircle {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		
		System.out.println("The area of the circle is " + circle1.getArea());
		System.out.println("The area of the circle is " + circle1.getPerimeter());

		Circle circle2 = new Circle(25);
		
		System.out.println("The area of the circle is " + circle2.getArea());
		System.out.println("The area of the circle is " + circle2.getPerimeter());

		Circle circle3 = new Circle(125);
		
		System.out.println("The area of the old circle is " + circle3.getArea());
		System.out.println("The area of the old circle is " + circle3.getPerimeter());

		circle3.setRadius(900);
		
		System.out.println("The area of the new circle is " + circle3.getArea());
		System.out.println("The area of the new circle is " + circle3.getPerimeter());
		

	}
}

class Circle {
	
	double radius;
	
	Circle(){
		
		radius = 1.0;
	}
	
	Circle (double newRadius){
		
		
		radius = newRadius;
	}
	
	double getArea () {
		
		return radius * radius * Math.PI;
	}
	
	double getPerimeter () {
		
		return radius * 2 * Math.PI;
	}
	
	void setRadius (double newRadius) {
		
		radius = newRadius;
	}
	
}
