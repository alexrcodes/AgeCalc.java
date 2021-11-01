import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();						 //Got the current date
		LocalDate birthDate = LocalDate.of(2004, 12, 10);		 //Created our birth date
		int years = Period.between(birthDate, today).getYears(); //Used Period.between() to get the years in between those two dates
		
		System.out.println(today);								 
		System.out.println(birthDate);
		System.out.println(years);
	}

}
