package tutorials;

public class tutorial_class_2_exercise_1 {

	public static void main(String[] args) {
		// input user marks. give grade and remarks using
		// two different methods
		
		java.util.Scanner inputuser = new java.util.Scanner(System.in);
		
		System.out.println("Please enter your marks : ");
		
		int marks = inputuser.nextInt();
		
		grading student1 = new grading();
		
		//call grades - grading
		System.out.println("Your grade is "
							+ student1.grades(marks));
		
		//call remarks - grading
		System.out.println("Remarks :  "
							+ student1.remarks(marks));
	}

}

class grading{
	
	//grades - marks from main
	String grades(int marks){
		
		if (marks>100 || marks<0)
			return "Invalid mark!";
		else 
		{
		if (marks>89)
			return "A";
		else if (marks>74)
			return "B";
		else if (marks>64)
			return "C";
		else if (marks>49)
			return "D";
		else
			return "F";
		}
	}
	
		//remarks - marks from main
		String remarks(int marks) {
			if (marks>100 || marks<0)
				return "Your marks is invalid!";
			else 
			{
			if (marks>89)
				return "Exellent!";
			else if (marks>74)
				return "Very Good!";
			else if (marks>64)
				return "Not bad!";
			else if (marks>49)
				return "Pass!";
			else
				return "Fail!";
			}
		}
}

