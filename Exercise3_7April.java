package practices;
import java.util.GregorianCalendar;
public class Exercise3_7April {

public static void main(String[] args) {
	
	GregorianCalendar calendar = new GregorianCalendar();
	
	System.out.println(" DATE : "
						+ calendar.get(GregorianCalendar.DAY_OF_MONTH) + " / "
						+ calendar.get(GregorianCalendar.MONTH) + " / "
						+ calendar.get(GregorianCalendar.YEAR) + "\n"
						);
	

		calendar.setTimeInMillis(1234567898765L);
		
		System.out.println(" DATE SINCE 1/1/1970 : "
						+ calendar.get(GregorianCalendar.DAY_OF_MONTH) + " / "
						+ calendar.get(GregorianCalendar.MONTH) + " / "
						+ calendar.get(GregorianCalendar.YEAR) + "\n");
}
}




