package tutorials;

import java.util.Scanner;
public class tutorial_class_1_exercise_3 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String remark;
	
	System.out.println("Input weight (kg) : ");
	double w = input.nextDouble();
	
	System.out.println("Input height (m) : ");
	double h = input.nextDouble();
	
	double bmi = w/h;
	
	if(bmi<18.5) {
		remark="Underweight";
	}
	else if(bmi < 25) {
		remark="Normal";
	}
	else if(bmi < 30.0) {
		remark="Overweight";
	}
	else {
		remark="Obese";
	}
	
	System.out.println("Your BMI is : " +bmi);
	System.out.println("Remarks for your BMI : " +remark);
// create a program that calculates the BMI
// BMI = body weight (kg) divided by height (m)

// BMI <18.5 - underweight
// 18.5 <= bmi < 25.0 - normal
// 25.0 <= bmi < 30.0 - overweight
// 30 <=bmi - obese
		

	}

}
