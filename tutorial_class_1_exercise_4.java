package tutorials;

public class tutorial_class_1_exercise_4 {

	public static void main(String[] args) {
		// Print all even numbers from 1 to 100
	int count=0;
	for(int i=1;i<101;i++) {
		if(i%2==0){
			count++;
		}
	}
	
	System.out.println("The amount of even numbers are : " + count);
	}

}
