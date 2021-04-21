package tutorials;
// Question 3 + Question 4
// Name : Sulaiman Ariffin bin Saji
// Matric Num : 2014975
// Section : OOP Sec 01 (Tutorial)
public class TC3E3 {

	public static void main(String[] args) {
	java.util.Scanner In = new java.util.Scanner(System.in);
	Student myself = new Student();
	myself.setInitial();
	
	System.out.println("BIODATA FORM SUBMISSION : ");

	//Get info
	System.out.println("Gender : ");
	myself.setGender(In.nextLine());
	
	System.out.println("Address : ");
	myself.setAddress(In.nextLine());
	
	System.out.println("Kuliyyah : ");
	myself.setKuliyyah(In.nextLine());
	
	System.out.println("Age : ");
	myself.setAge(In.nextInt());
	
	System.out.println("CGPA : ");
	myself.setCgpa(In.nextDouble());

	//Share Info
	System.out.println("\n\n");
	System.out.println("Name : " + myself.getName());
	System.out.println("Matric Num : " + myself.getMatNum());
	
	System.out.println("Gender : " + myself.getGender());
	System.out.println("Age : " + myself.getAge());
	System.out.println("Address : " + myself.getAddress());
	System.out.println("Kuliyyah : " + myself.getKuliyyah());
	System.out.println("CGPA : " + myself.getCgpa());
	
	//ADDITION OF QUESTION 4
	
	System.out.println("Remarks : " + myself.getRemarks());
	
	//end of question 4
	In.close();
	}

}
class Student{
	
	String name, kuliyyah, address;
	String gender;
 	int matricNum, age;
 	double cgpa;
	
	public void setInitial() {
		this.name = "Sulaiman";
		this.matricNum = 2014975;
	}
	
	//SETTERS
	void setGender(String gender) {
		this.gender = gender;
	}
	void setAge(int age) {
		this.age = age;
	}
	void setKuliyyah(String kuliyyah) {
		this.kuliyyah = kuliyyah;
	}
	void setAddress(String address) {
		this.address = address;
	}
	void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	//GETTERS
	String getName() {
		return this.name;
	}
	int getMatNum() {
		return this.matricNum;
	}
	String getGender() {
		return this.gender;
	}
	int getAge() {
		return this.age;
	}
	String getKuliyyah() {
		return this.kuliyyah;
	}
	String getAddress() {
		return this.address;
	}
	double getCgpa() {
		return this.cgpa;
	}
	
	//Method - Remarks
	//Question 4 : ADD A REMARK DATA FIELD.
	String getRemarks() {
		String remark;
		
		if (this.cgpa > 4.00 || this.cgpa < 0.00) {
			remark = "INVALID CGPA !";
		}
		
		else {
			if (this.cgpa > 3.59) { //cgpa 4.00 - 3.60
				remark = "EXCELLENT!";
			}
			
			else if (this.cgpa > 3.19) { //cgpa 3.2 - 3.59
				remark = "VERY GOOD!";
			}
			
			else if (this.cgpa > 2.79) {//cgpa 2.8 - 3.19
				remark = "GOOD!";
			}
			
			else if (this.cgpa > 2.39) {//cgpa 2.4 - 2.79
				remark  = "AVERAGE!";
			}
			
			else if (this.cgpa > 1.99) {//cgpa 2 - 2.39
				remark = "JUST PASSING!";
			}
			
			else { //cgpa 0.00 - 1.99
				remark = "WORK HARDER!";
			}
		}
		return remark;
	}
	
}
