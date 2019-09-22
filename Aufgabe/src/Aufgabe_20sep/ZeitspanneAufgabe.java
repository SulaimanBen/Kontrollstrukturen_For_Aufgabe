package Aufgabe_20sep;

import java.util.*;

public class ZeitspanneAufgabe {
	
	public static void main(String[] args) {
		String t1="";
		String t2="";
		String tag1=getZeitspanneInGanzenTagen(5,  2, 2019);
		String tag2 =getZeitspanneInGanzenTagen(1,  1, 2020);
		 
		
		// Delete '-' from String (Date)
		for(int i=0 ; i< tag1.length(); i++) {
			 if(tag1.charAt(i) != '-') {
				 t1=t1+tag1.charAt(i);
			 }
			 else
				 continue;
		 }
		for(int i=0 ; i< tag2.length(); i++) {
			 if(tag1.charAt(i) != '-') {
				 t2=t2+tag2.charAt(i);
			 }
			 else
				 continue;
		 }
		
		
		 
		
		
	}// End of Main
	
	static String getZeitspanneInGanzenTagen(int tag, int monat, int jahr) {
		
		int t=tag;
		int m=monat;
		int j=jahr;
		String datum;
				switch(monat) {
				
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: if(t <= 31 && t > 0) {
							datum=Integer.toString(t)+"-"+Integer.toString(m)+"-"+Integer.toString(j);
							return datum;
							}
				else
					datum="Falsche Tag Angabe";
				return datum;
				case 2: if(istSchaltJahr(jahr)) {
							if(t <= 29 && t > 0) {
								datum=Integer.toString(t)+"-"+Integer.toString(m)+"-"+Integer.toString(j);
							    return datum;
							}
							else
								return datum="Ist Schaltjahr";
				}
				else if(istSchaltJahr(jahr) == false) {
					if(t <= 28 && t > 0) {
						datum=Integer.toString(t)+"-"+Integer.toString(m)+"-"+Integer.toString(j);
						return datum;
					}
					else
						return datum="Ist Nicht Schaltjahr";
				}
				default: 
					if( 0 < tag && t <= 30 && m >0 && m <= 12)
						return datum=Integer.toString(t)+"-"+Integer.toString(m)+"-"+Integer.toString(j);
				}
				
				return datum="Undefind";
	}
	
	
	// Methode, die überprüft ob das übergebene Jahr (int jahr) ein schaltjahr ist oder nicht. 
	static boolean istSchaltJahr(int jahr) {
		
		if(jahr %4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0))
				return true;
		else
				return false; 
	}
	
	static void AnzahlTagen(String tag1, String tag2) {
		 
	}
	
	
	
}
