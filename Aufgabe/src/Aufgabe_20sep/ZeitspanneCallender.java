package Aufgabe_20sep;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ZeitspanneCallender {
	
	public static void main(String[] args) {
		
		
		
		DateDifference();
		
	}
	
	/*static void setDate(int day,int month,int year) {
		
		GregorianCalendar calendar=new GregorianCalendar(year, month-1, day);
		
		Date date=calendar.getTime();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(dateFormat.format(date));
	}*/
	
	    static void DateDifference() {
		 Calendar cal1 = new GregorianCalendar();
		 Calendar cal2 = new GregorianCalendar();

		 cal1.set(2018,12,13); 
		 cal2.set(2019, 1, 31);
		System.out.println("Tage= "+daysBetween(cal1.getTime(),cal2.getTime()));
		 }
		 static int daysBetween(Date d1, Date d2){
		 return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
		 }

}
