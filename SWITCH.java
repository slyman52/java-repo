package basic_on_java;

import java.util.Scanner;

public class SWITCH {

	public static void main(String[] args) {
		
	//Switch Statements
	
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		year= input.nextInt();
		switch(year%9) 
		{
		case 0 : System.out.println("Year 0");break;
		case 1 : System.out.println("Year 1");break;
		case 2 : System.out.println("Year 2");break;
		case 3 : System.out.println("Year 3");break;
		case 4 : System.out.println("Year 4");break;
		case 5 : System.out.println("Year 5");break;
		case 6 : System.out.println("Year 6");break;
		case 7 : System.out.println("Year 7");break;
		case 8 : System.out.println("Year 8");break;
		default: System.out.println("This is default case");
		}

		System.out.println("Out of switch statement");
		
		input.close();
}
}
