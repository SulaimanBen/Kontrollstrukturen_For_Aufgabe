package Aufgabe_20sep;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ZeitspanneAPIs {
	
	public static void main(String[] args) {
		
		LocalDate Date1 = LocalDate.of(2018,12,13);
		LocalDate Date2= LocalDate.of(2019, 1, 31);
		
		long daysBetween = ChronoUnit.DAYS.between(Date1, Date2);
		System.out.println("Tage= "+daysBetween);
	}
	
}
