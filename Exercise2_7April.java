package practices;
import java.util.Date;
public class Exercise2_7April {

	public static void main(String[] args) {
	
		Account account1 = new Account();
		
		account1.setid(1122);
		account1.setbalance(20000);
		account1.setinterestrate(4.5);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println("Account ID : " + account1.getId() + "\n" 
						+  "Balance    : " + account1.getBalance()  + "\n"
						+  "Monthly Interest : " + account1.getMonthlyInterest() + "\n"
						+  "Date Created : " +account1.dateCreated);
		
	}

}

class Account{
	
	//id, balance, annual interest rate, date
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	Date dateCreated = new Date();
	
	//getter month interest rate
	public double getMonthlyInterestRate(){
	return annualInterestRate / 100 / 12 ;
	}
	
	//getter month interest
	public double getMonthlyInterest(){
	return balance * annualInterestRate / 100 / 12 ;
	}
	
	//getter id
	public int getId() {
	return id;
	}
	
	//getter balance
	public double getBalance() {
	return balance;
	}
	
	// withdraw 
	public double withdraw(double money){
	balance -= money;
	return balance;
	}
	
	//deposit
	public double deposit(double money){
	balance += money; 
	return balance;
	}
	
	//set id
	void setid(int newid){
	id = newid;
	}
	
	//set balance
	void setbalance(double newbalance){
	balance = newbalance;
	}
	
	//set interest rate
	void setinterestrate(double newInterest){
	annualInterestRate = newInterest;
	}
}