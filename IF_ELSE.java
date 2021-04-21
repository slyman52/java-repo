package basic_on_java;
// IF_ELSE
import java.util.Scanner;
public class IF_ELSE {

	public static void main(String[] args) {
		
Scanner inputuser = new Scanner (System.in);
	double num1, num2;
	double result;
	//num1 from user, num2 is random

	num2 = Math.random();
		    
System.out.println("Enter an integer : ");
	num1 = inputuser.nextDouble();
		    
	 result = num2 - num1;
	 System.out.println("The result is " + result);
	 if(result > 5)
	 {
		 System.out.println("My name is Sulaiman Ariffin");
	  }
	 else
	   System.out.println("The result is lower than 5");
	 
	 inputuser.close();

	}

}
