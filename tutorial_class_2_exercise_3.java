package tutorials;
public class tutorial_class_2_exercise_3 {

	public static void main(String[] args) {
		//use array to store cgpa of
		//a class of students and find the 
		//lowest and highest cgpa as well as
		//the average
		@SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("ENTER NUMBER OF STUDENTS : ");
		int student = input.nextInt();
		
		double [] cgpa = new double[student-1];
		char [] list = {'A','B','C','D','E'};
		
		//insert student number
		
		
		//insert cgpa - loop
		System.out.println("Insert students cgpa : ");
		
		for(int i=0;i<student;i++) {
		
			System.out.println("Student "+ list[i] + " : " );
			cgpa[i] = input.nextDouble();

		}	
		
		//the minimum and maximum cgpa
		double max = 0, min = 4.00;

		for(int l = 0; l<student; l++) {
			
			if(cgpa[l] > max){
				max = cgpa[l];
			}
			
			if (cgpa[l] < min) {
				min = cgpa[l];
			}
		}
		
		
		double total=0;
		for(int f=0;f<student;f++) {
		total+=cgpa[f];
		}
		
		double avg = total/student;
		
		System.out.println("The average CGPA is " + avg);
		
	}

}
