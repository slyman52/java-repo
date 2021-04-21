package tutorials;

import java.util.Scanner;
public class tutorial_class_1_exercise_1 {

	public static void main(String[] args) {
	    // create a program that takes two value
	    // calculate volume cylinder
	    // formula PI * r^2 * h 
	    // PI = 3.14159
	    
	    System.out.println("Program to calculate volume of cylinder");
	    
	    //create Scanner
	    Scanner input = new Scanner(System.in);
	    
	    // get input for radius 
	    System.out.println("INPUT VALUE FOR RADIUS : ");
	    double r = input.nextDouble();
	    
	    // get input for height
	    System.out.println("INPUT VALUE FOR HEIGHT : ");
	    double h = input.nextDouble();
	    
	    //calculate volume 
	    double volume = 3.14159 * r * r * h;
	    
	    System.out.println("Volume of your cylinder : " + volume);
	    	}

}
