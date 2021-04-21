package tutorials;

import java.util.Scanner;
public class tutorial_class_1_exercise_2 {

	public static void main(String[] args) {	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your marks : ");
	int myMarks = input.nextInt();
	char myGrade = ' ';
	
	if (myMarks > 100) {
		System.out.println("Your marks are too high !");
	}
	else if(myMarks < 0) {
		System.out.println("Your marks are negative !");
	}
	else {
		// 100 - 90 --> A
		if(myMarks>=90) {
			myGrade = 'A';
		}
		// 89  - 75 --> B
		else if (myMarks>=75) {
			myGrade = 'B';
		}
		// 74  - 65 --> C
		else if (myMarks>=65) {
			myGrade = 'C';
		}
		// 64  - 50 --> D
		else if (myMarks>=50) {
			myGrade = 'D';
		}
		// Below 50 --> F
		else {
			myGrade = 'F';
		}
		System.out.println("Your grade is : "+ myGrade);
		
		switch (myGrade) {
		case 'A' : System.out.println("Excellent!");break;
		case 'B' : System.out.println("Good Job!");break;
		case 'C' : System.out.println("Not Bad!");break;
		case 'D' : System.out.println("Passing Mark!");break;
		case 'F' : System.out.println("You Failed!");break;
		default  : System.out.println("Try again?");break;
		}
	}
	
	}

}
