package tutorials;

public class tutorial_class_2_exercise_2 {

	public static void main(String[] args) {
//Store weights and heights of 5 people in 
//two single-dimension arrays and calculate their
//BMI and store it in a different array and display it
		
java.util.Scanner input = new java.util.Scanner(System.in);

	//array declaration of weight, height and BMI
	double [] weight = {0,0,0,0,0};
	double [] height = {0,0,0,0,0};
	double [] bmi = {0,0,0,0,0};
	
	//Loop 1 : Input for weight and height
	for(int i=0;i<5;i++) {
		
		System.out.println("Weight " + i+1 + " (kg): ");
		weight[i]= input.nextDouble();
		
		System.out.println("Height "+ i+1 + " (m): ");
		height[i]= input.nextDouble();
		
		System.out.println(" \n ");
		
		}
	
	//Loop 2 : Insert data into BMI array
	for(int j=0;j<5;j++) {
	bmi [j] = BMI(weight[j],height[j]);
		}
	
	//Loop 3 : print the BMI array
	for(double k : bmi) {
		System.out.println("BMI : " + k);
	}
	
	}
	
	//method to calculate bmi;
	public static double BMI (double w, double h) {
	
	return w / (h*h);
	}
}



